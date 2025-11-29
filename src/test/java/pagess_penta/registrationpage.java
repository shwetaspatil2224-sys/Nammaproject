package pagess_penta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpage {
	WebDriver driver;
	
	public registrationpage(WebDriver driver){
		this.driver=driver;//this.instance variable=local variable
	}
	 
	 By fn=By.id("input-firstname");
	 By ln=By.id("input-lastname");
	 By ml=By.id("input-email");
	 By tp=By.id("input-telephone");
	 By pw=By.id("input-password");
	 By pc=By.id("input-confirm");
	 By rd=By.xpath("//input[@value='0']");
	 By pp=By.xpath("//input[@name='agree']");
	 By cb=By.xpath("//input[@value='Continue']");
	 
	 
	 public void firstname() {
		 driver.findElement(fn).sendKeys("milliy bobby");
	 }
	 public void lastname() {
		 driver.findElement(ln).sendKeys("brown");
	 }
	 public void email(){
		 driver.findElement(ml).sendKeys("millybobbybrown@gmail.com");
	 }
	 public void telephone() {
		 driver.findElement(tp).sendKeys("1234567891");
	 }
	 public void password() {
		 driver.findElement(pw).sendKeys("jake123");
	 }
	 public void paswordconfirm() {
		 driver.findElement(pc).sendKeys("jake123");
	 }
	 public void radiobutton() {
		 driver.findElement(rd).click();
	 }
	 
	 public void privacypolicy() {
		 driver.findElement(pp).click();
	 }
     public void continuebutton() {
		 driver.findElement(cb).click();
	 }
}
