package runner_penta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features= {"C:\\Users\\Dell\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\Penta_life\\tutorialsnijaproject"},
	
	glue= {"stepdef_penta"},
	
	dryRun=false,
	
   monochrome = true,
   plugin = {
	 "pretty",
	"html:reports/cucumber-html-report.html",
    "json:reports/cucumber.json",
    "junit:reports/cucumber.xml"
		
	}
		)


public class loginrunnerfile extends AbstractTestNGCucumberTests{

}
