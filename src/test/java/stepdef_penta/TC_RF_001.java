package stepdef_penta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess_penta.registrationpage;

public class TC_RF_001 {
	
public static 	WebDriver driver;
	 registrationpage rp;
	 
	@Given("User has opened the browser and launched the application")
	public void user_has_opened_the_browser_and_launched_the_application() throws InterruptedException {
	   driver= new ChromeDriver();
	   Hooks.driver=driver;
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	   driver.manage().window().maximize();
	   Thread.sleep(5000);
	   
	     rp=new registrationpage(driver);
	}

	@When("User enters valid first name")
	public void user_enters_valid_first_name() {
	  rp.firstname();
	}

	@When("User enters valid last name")
	public void user_enters_valid_last_name() {
	   rp.lastname();
	}

	@When("User enters valid E-mail")
	public void user_enters_valid_e_mail() {
	   rp.email();
	}

	@When("User enters Telephone")
	public void user_enters_telephone() {
	   rp.telephone();
	}

	@When("User enters password")
	public void user_enters_password() {
	  rp.password();
	}

	@When("User enters password confirm")
	public void user_enters_password_confirm() {
	    rp.paswordconfirm();
	}

	@When("User clicks on radio button no")
	public void user_clicks_on_radio_button_no() {
	   rp.radiobutton();
	}

	@When("User clicks on privacy policy checkbox")
	public void user_clicks_on_privacy_policy_checkbox() {
	   rp.privacypolicy();
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
	    rp.continuebutton();
	}

	@Then("User should be registered")
	public void user_should_be_registered() {
	  Assert.assertEquals(driver.getTitle(),"Your Account Has Been Created!");
	}
}
