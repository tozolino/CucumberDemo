package pom;

import caps.DesiredCaps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class YouTube extends DesiredCaps {

    public YouTube(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public YouTube() {
    }

    @AndroidFindBy(id = "youtube_logo")
    public MobileElement youtubeLogo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public MobileElement video;


    public void tapOnVideo(MobileElement e) {
        try {
            e.click();
        } catch (Exception ex) {
            throw new RuntimeException("Click failed", ex);
        }
    }
}
