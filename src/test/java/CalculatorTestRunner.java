import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(strict = true, plugin = {"pretty"}, glue = "stepdefs", features = "classpath:features", monochrome = true)
public class CalculatorTestRunner extends AbstractTestNGCucumberTests {}
