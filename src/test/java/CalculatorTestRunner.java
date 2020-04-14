
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
plugin = {"pretty"}, glue = "stepdefs", features = "classpath:features")
public class CalculatorTestRunner {
}
