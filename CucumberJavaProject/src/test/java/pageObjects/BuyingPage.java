package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyingPage {

public WebDriver ldriver;
	
	public BuyingPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id='buy-now-button']")
	@CacheLookup
	WebElement buyNowClick;
//Action methods
		
		public void clickBuyNow() {
			buyNowClick.click();
		}

}
