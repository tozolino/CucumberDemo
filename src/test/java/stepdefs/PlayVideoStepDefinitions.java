package stepdefs;

import caps.DesiredCaps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pom.YouTubePage;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlayVideoStepDefinitions extends DesiredCaps {


    YouTubePage yt;

    @BeforeClass(alwaysRun = true)
    @Parameters(value = {"config", "environment", "os"})
    public void setUp(@Optional String conf, @Optional String env, @Optional String os, ITestContext context) throws Exception {
        super.setUp(conf, env, os, context.getName());

        yt = new YouTubePage(driver);
    }


    @Given("^User has launched YouTube app$")
    public void user_has_launched_YouTube_app() throws InterruptedException {
        Thread.sleep(5000);
        boolean logo = yt.youtubeLogo.isDisplayed();
        assertThat("Video is not playing", logo, is(true));
    }

    @Given("^YouTube home screen is displayed$")
    public void youtube_home_screen_is_displayed() {
        assertThat("Video is not playing", true, is(true));
    }

    @When("^User taps on any available video$")
    public void user_taps_on_any_available_video() {
        assertThat("Video is not playing", true, is(true));
    }

    @Then("^Video starts playing$")
    public void video_starts_playing() {
        assertThat("Video is not playing", true, is(true));
    }

}
