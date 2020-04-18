import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (strict = true, plugin = {"pretty"}, glue = "stepdefs/youtube", features = "classpath:features/youtube", monochrome = true)
public class YouTubeTestRunner extends AbstractTestNGCucumberTests {
}
