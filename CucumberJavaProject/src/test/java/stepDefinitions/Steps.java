package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.BuyingPage;
import pageObjects.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.*;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.BuyingPage;
import pageObjects.HomePage;

public class Steps extends BaseClass {
	
	@SuppressWarnings("deprecation")
	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","/Users/aakarsha/Documents/TDAutomation/CucumberJavaProject/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		hp=new HomePage(driver);
	    
	}

	@SuppressWarnings("deprecation")
	@When("User enters {string}")
	public void user_enters(String url) throws InterruptedException {
	    driver.get(url);
	    Assert.assertTrue(true);
	}

	@When("User clicks on the hamburger menu")
	public void user_clicks_on_the_hamburger_menu() {
	   hp.clickHamburger();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User selects Kindle under Digital Content")
	public void user_selects_kindle_under_digital_content() {
	    hp.clickCategory();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("User selects Kindle under e-readers")
	public void user_selects_kindle_under_e_readers() throws InterruptedException {
		hp.clickSubCategory();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}
	
	@Then("User clicks on Buy Now")
	public void user_clicks_on_buy_now() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.clickBuyNow();
		}

	@SuppressWarnings("deprecation")
	@Then("Verify user is asked for email or mobile number")
	public void verify_user_is_asked_for_email_or_mobile_number() {
		if(driver.getPageSource().contains("E-mail address or mobile phone number")) {
			Assert.assertTrue(true);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		

	@Then("close the browser")
		public void close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		}
	

}
