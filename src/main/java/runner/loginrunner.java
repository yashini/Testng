package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		format={"pretty","html:report/html","json:report/json/cucumber-json"},
		features ={"src/main/java/feature"},
		tags={"@Test2,@Test"},
		glue ={"stepdefinition"}
		
		)

public class loginrunner extends AbstractTestNGCucumberTests {
	
	

}
