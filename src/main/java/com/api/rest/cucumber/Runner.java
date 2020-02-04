package com.api.rest.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/calculos.feature", 
                glue = {"com.api.rest.steps"}, 
                monochrome = false, 
                snippets = SnippetType.CAMELCASE, 
                dryRun = false, 
                strict = true, 
                plugin = {
                "json:target/RunCuke/cucumber.json",
                "pretty", "html:target/RunCuke/cucumber" }, 
                tags = { "@CT-03" })

public class Runner {

}
