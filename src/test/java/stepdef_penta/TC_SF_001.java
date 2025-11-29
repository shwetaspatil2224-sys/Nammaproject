package stepdef_penta;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess_penta.loginpage;
import pagess_penta.registrationpage;
import pagess_penta.searchpage;

public class TC_SF_001 {
	
	WebDriver driver;
	registrationpage rp;
	loginpage lp;
	searchpage sp;
	
	
	@Given("User has logged inn")
	public void user_has_logged_inn() throws InterruptedException {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    Thread.sleep(5000);
	    
	    lp= new loginpage(driver);
	    rp=new registrationpage(driver);
	    sp=new searchpage(driver);
	}

	@When("User logs in")
	public void user_logs_in() {
		rp.email();
	 rp.password();
	 lp.loginbtn();
	 
	}

	@When("User enters a valid product name in the search boxx")
	public void user_enters_a_valid_product_name_in_the_search_boxx() {
	   sp.searchbar();
	}

	@When("User clicks on search buttonss")
	public void user_clicks_on_search_buttonss() {
	   sp.searchicon();
	}

	@Then("User should see the searched product displayedd")
	public void user_should_see_the_searched_product_displayedd() {
	   Assert.assertEquals(driver.getTitle(), "Search - mac");
	}
}
