package runner_penta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features= {"C:\\Users\\Dell\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\Penta_life\\tutorialsnijaproject\\registrationpenta.feature"},

glue= {"stepdef_penta"},

dryRun=false

		
		)
public class runnerfile extends AbstractTestNGCucumberTests {

}
