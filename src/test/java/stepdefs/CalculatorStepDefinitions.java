package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Calculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CalculatorStepDefinitions {

    Calculator calc;
    int result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calc = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer a, Integer b) {
        result = calc.add(a,b);
    }

    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
    assertThat("Result not equals 3", result, is(3));
    }
}
