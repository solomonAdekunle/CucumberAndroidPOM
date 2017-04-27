 package AndroidMobile_Cucu.Suite;


	import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.java.it.Date;
	import cucumber.api.junit.Cucumber;

	// runner class
	

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = {"src\\main\\resources\\Com\\Features\\"},
tags = {"~@ignore"})
//@Cucumber.Options(format={"html:output"}
	
	public class Runner {
	
		
		
		
		
	
}
