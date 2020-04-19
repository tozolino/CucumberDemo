import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (strict = true, plugin = {"pretty"}, glue = "stepdefs", features = "classpath:features", monochrome = true)
public class YouTubeTestRunner extends AbstractTestNGCucumberTests {
}
