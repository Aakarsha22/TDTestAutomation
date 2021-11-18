package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	public WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "nav-hamburger-menu")
	@CacheLookup
	WebElement menuClick;
	
	@FindBy(linkText = "Kindle")
	@CacheLookup
	WebElement categoryClick;
	
	@FindBy(xpath= "//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[@class='hmenu-item'][normalize-space()='Kindle']")
	@CacheLookup
	WebElement subCategoryClick;
	
	@FindBy(xpath = "//input[@id='buy-now-button']")
	@CacheLookup
	WebElement buyNowClick;

	
	public void clickHamburger() {
		menuClick.click();
	}
	
	public void clickCategory() {
		categoryClick.click();
	}
	
	public void clickSubCategory() {
		subCategoryClick.click();
	}
	
	public void clickBuyNow() {
		buyNowClick.click();
	}
}
	
