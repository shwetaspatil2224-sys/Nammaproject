package runner_penta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"C:\\Users\\Dell\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\Penta_life\\tutorialsnijaproject\\search.feature"},
		
		glue= {"stepdef_penta"}
		
		)

public class searchrunnerfile extends AbstractTestNGCucumberTests {

}
