package com.bdd.ut.definition;

import com.bdd.ut.FizzBuzz;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzStepDefs {

    String result;

    @When("^user enter (\\d+)$")
    public void userEnter(int input) {
        FizzBuzz fb = new FizzBuzz();

        result = fb.playFB(input);
    }

    @Then("^return value is Fizz$")
    public void returnValueIsFizz() {
        assertEquals("Fizz", result);
    }
}
