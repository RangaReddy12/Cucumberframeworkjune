package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},monochrome=true,tags={"@tag2"},glue={"stepDenfinations"}
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/multiple.html",
		"pretty", "html:target/cucumber-reports"})
public class Runner2 extends AbstractTestNGCucumberTests {

}
