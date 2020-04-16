import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(strict = true, plugin = {"pretty"}, glue = "stepdefs", features = "classpath:features")
public class CalculatorTestRunner extends AbstractTestNGCucumberTests {}
