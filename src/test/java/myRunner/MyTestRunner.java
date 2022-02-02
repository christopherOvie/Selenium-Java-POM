package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//WIP

@RunWith(Cucumber.class)

@CucumberOptions(
		//work in progress
		//features= "\\Users\\chris\\Task\\POMSeleniumJavaProject\\src\\test\\resources\\MyLogin.feature",

		features="src/test/resources",
		glue= {".//steps/LoginStepDefinition"},
		dryRun= true  //check if missing step
		
		
		
		)

public class MyTestRunner {
	
	
	

}
