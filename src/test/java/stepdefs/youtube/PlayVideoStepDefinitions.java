package stepdefs.youtube;

import caps.DesiredCaps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.YouTube;

import java.net.MalformedURLException;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlayVideoStepDefinitions extends DesiredCaps {


    public PlayVideoStepDefinitions() throws MalformedURLException {
    }

    @Given("User has launched YouTube app")
    public void user_has_launched_YouTube_app() {
        //yt.launchTheApp();
        assertThat("TODO", true, is (true));
    }

    @Given("YouTube home screen is displayed")
    public void youtube_home_screen_is_displayed() {
        //logoIsDisplayed = yt.youtubeLogo.isDisplayed();
        assertThat("TODO", true, is (true));
    }

    @When("User taps on any available video")
    public void user_taps_on_any_available_video() {
        assertThat("TODO", true, is (true));
    }

    @Then("Video starts playing")
    public void video_starts_playing() {
        assertThat("TODO", true, is(true));
    }

}
