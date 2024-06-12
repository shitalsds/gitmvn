package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpagecu {
public WebDriver driver;
	
	public  Loginpagecu(WebDriver driver) {
		this.driver=driver;
	}
		
		
		private By username=By.id("username");
		private By password=By.id("password");
		private By submit=By.xpath("//*[@type='submit']");
		
		public void launchWebsite(String websiteName) {
			driver.get(websiteName);
		}

		public void setUserName(String testuser) {
		 driver.findElement(username).sendKeys(testuser);
		}
	 
		public void setPassword(String testpassword) {
		 driver.findElement(password).sendKeys(testpassword);
		}

		public void clickOnSubmitButton() {
		 driver.findElement(submit).click();
		}
		
		public String getCurrentUrlOfPage() {
			return driver.getCurrentUrl();
		}
		
		public void handleAlertAndAccept() {
			driver.switchTo().alert().accept();
		}

		
		
	}
	





