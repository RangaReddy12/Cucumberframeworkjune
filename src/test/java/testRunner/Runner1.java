package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},tags={"@tag1"},monochrome=true,glue={"stepDenfinations"}
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Login.html",
		"pretty", "html:target/cucumber-reports"})
public class Runner1 extends AbstractTestNGCucumberTests {

}
