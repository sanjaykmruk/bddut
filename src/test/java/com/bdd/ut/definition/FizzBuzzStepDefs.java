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


    @When("user enter number {int}")
    public void userEnterNumber(int input) {
        FizzBuzz fb = new FizzBuzz();

//        result = fb.playFB(Integer.parseInt(input));
        result = fb.playFB(input);
    }


    @Then("return value is {string}")
    public void returnValueIs(String output) {
        assertEquals(output, result);
    }

}
