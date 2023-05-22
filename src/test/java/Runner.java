

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/IY20463954/Documents/Assignments/cucumber_selenium/src/test/java/loginTest.feature"
		,glue={"trailCucumber"}
		)

public class Runner extends AbstractTestNGCucumberTests {
	
	

}
