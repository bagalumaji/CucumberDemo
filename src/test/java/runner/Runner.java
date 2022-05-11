package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},glue = {"stepdefs"},tags = "@dataTableList")
public class Runner extends AbstractTestNGCucumberTests {
}
