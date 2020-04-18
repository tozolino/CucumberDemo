package caps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class DesiredCaps {
    public AppiumDriver<MobileElement> driver;


    protected DesiredCaps(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    public DesiredCaps() {

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
