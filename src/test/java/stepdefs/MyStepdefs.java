package stepdefs;

import com.games.fizzbuzz.FizzBuzz;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    FizzBuzz fizzBuzz;
    private String result;

    @Given("^Create FizzBuzz game$")
    public void createFizzBuzzGame() {
        fizzBuzz = new FizzBuzz();
    }

    @When("^Play with number (\\d+)$")
    public void playWithNumber(int number) {
        result = fizzBuzz.play(number);
    }

    @Then("^Get the \"([^\"]*)\"$")
    public void getThe(String expectedResult) throws Throwable {
        assertEquals(expectedResult, result);

    }
}
