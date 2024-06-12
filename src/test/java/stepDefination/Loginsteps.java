package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Loginpagecu;
import ui.cucumber12.TestBase2;

public class Loginsteps {
	public Loginpagecu lp;
	public TestBase2 tb;
	
	public Loginsteps() throws IOException {
		this.tb=new TestBase2();
		this.lp= new Loginpagecu(tb.launchDriver());
	}
	@Given("Enter the url {string}")
	public void enter_the_url(String string) {
	    lp.launchWebsite(string);

	    
	}
	@When("Enter UserName {string} and Password {string}")
	public void enter_user_name_and_password(String string, String string2) {
	    lp.setUserName(string);
	    lp.setPassword(string2);
	}
	@When("click on submit button")
	public void click_on_submit_button() {
		lp.clickOnSubmitButton();
		lp.handleAlertAndAccept();

	}
	@Then("Verify user land on homepage")
	public void verify_user_land_on_homepage() {
		assertEquals(lp.getCurrentUrlOfPage(), "https://debugautomation.com/Home.html");

	}
}

	
  
    

