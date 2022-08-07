package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\WorkSpace\\Automation\\src\\test\\java\\featureFile", 
glue = "C:\\WorkSpace\\Automation\\src\\test\\java\\stepDefinition\\",
monochrome = true, dryRun = false)
public class runner {

}
