package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
 
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\madhutejaswara reddy\\eclipse-workspace\\project6\\src\\test\\java\\features\\addtocart.feature",
glue = {"steps"},
dryRun = false,
plugin = {"html:target/Cucumberreport.html",
		 "pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "timeline:test-output-thread/"})
public class Runners {
	
}
