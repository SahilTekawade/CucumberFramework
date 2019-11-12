package MyTestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Admin\\eclipse-workspace\\cucumberFramework\\src\\main\\java\\Features\\login.feature",
		glue={"stepDefination"}		
		)


public class LoginTestRunner {

}
