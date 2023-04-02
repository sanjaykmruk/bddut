package com.bdd.ut.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json", "junit"},
        features = "classpath:features",
        glue = {"com.bdd.ut"})
public class CucumberRunner {
}
