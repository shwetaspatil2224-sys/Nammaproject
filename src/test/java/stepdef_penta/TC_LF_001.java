package stepdef_penta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess_penta.loginpage;

public class TC_LF_001 {
	 WebDriver driver;
	 loginpage lp;
	
	@Given("User has launcehd and browser and the application")
	public void user_has_launcehd_and_browser_and_the_application() throws InterruptedException {
	   driver=new ChromeDriver();
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	   driver.manage().window().maximize();
	   Thread.sleep(5000);
	   
	    lp= new loginpage(driver);
	}
	@When("User enters valid Email")
	public void user_enters_valid_email() {
	   lp.Email();
	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
	  lp.password();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	   lp.loginbtn();
	}

	@Then("User should be in dashboard page")
	public void user_should_be_in_dashboard_page() {
		 Assert.assertEquals(driver.getTitle(),"My Account");
	}
}
