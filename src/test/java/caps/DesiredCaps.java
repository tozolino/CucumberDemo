package caps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

public class DesiredCaps {


    //fields
    public static AppiumDriver<MobileElement> driver;

    //constructors
    protected DesiredCaps() {
    }

    protected DesiredCaps(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //appium server url
    String appiumURL = "http://127.0.0.1:4723/wd/hub";


    //setting up capabilities and driver
    protected void setUp(String conf, String env, String os, String testName) throws IOException, ParseException {

        //reading configuration
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/resources/conf" + conf));
        JSONObject envs = (JSONObject) config.get("environments");

        //setting up capabilities based on configuration
        DesiredCapabilities capabilities = new DesiredCapabilities();

        Map<String, String> deviceCapabilities = (Map<String, String>) envs.get(env);
        Iterator it = deviceCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            capabilities.setCapability(pair.getKey().toString(), pair.getValue());
        }

        Map<String, String> platformCapabilities = (Map<String, String>) config.get("capabilities");
        it = platformCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (capabilities.getCapability(pair.getKey().toString()) == null) {
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
        }


        //setting up driver based on platform info
        if (os.equals("android")) {
            driver = new AndroidDriver<>(new URL(appiumURL), capabilities);
        } else if (os.equals("ios")) {
            driver = new IOSDriver<>(new URL(appiumURL), capabilities);
        }


    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }


}
