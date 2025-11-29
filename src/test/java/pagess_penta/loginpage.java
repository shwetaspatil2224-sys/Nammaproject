package pagess_penta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	
	public loginpage(WebDriver driver){
		this.driver=driver;
	}
	
	By mail=By.id("input-email");
	By pwd=By.id("input-password");
	By log=By.xpath("//input[@value='Login']");
	
	public void Email(){
	driver.findElement(mail).sendKeys("millybobbybrown@gmail.com");
	}
	public void password() {
	driver.findElement(pwd).sendKeys("jake123");
	}
	public void loginbtn() {
		driver.findElement(log).click();
	}

}
