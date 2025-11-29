package pagess_penta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchpage {

	WebDriver driver;
	 public searchpage(WebDriver driver){
		 this.driver=driver;
	 }
	 
	 
	 
	 By bar=By.xpath("//input[@placeholder='Search']");
	 By icon=By.xpath("//button[@class='btn btn-default btn-lg']");
	 
	 
	public void searchbar() {
		driver.findElement(bar).sendKeys("mac");
	}
	public void searchicon() {
		driver.findElement(icon).click();
	}
}
