package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchElement extends basepage{

	public SearchElement(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//span[text()='Get It in 2 Days']")
	WebElement clickcheckbox;
	
	@FindBy(xpath = "//span[text()='256 GB']")
	WebElement clickGBbox;
	
	@FindBy(xpath = "//span[text()='Apple']")
	WebElement clickAPPLEbox;
	
	@FindBy(xpath = "//span[text()='5G']")
	WebElement click5Gbox;
	
	@FindBy(xpath = "/span[text()='6 to 7.9 GB']")
	WebElement clickRAMbox;
	
	@FindBy(xpath = "//span[text()='Up to 2,999 mAh']")
	WebElement clickBATTERYbox;
	
	@FindBy(xpath = "//span[text()='5.5 in & above']")
	WebElement clickSCREENbox;
	
	@FindBy(xpath = "//span[text()='OxygenOS']")
	WebElement clickSYSTEMbox;
	
	@FindBy(xpath = "//span[text()='Up to 3.9 MP']")
	WebElement clickCEMERAbox;
	
	@FindBy(xpath = "//span[text()='Clicktech Retail Private Ltd']")
	WebElement clickSELLERbox;
	
	@FindBy(xpath = "//span[text()='2 - 2.4 GHz']")
	WebElement clickSPEEDbox;
	
	public void selectDelivery() {
		clickcheckbox.click();
	}
	public void selectStorage() {
		clickGBbox.click();
	}
	public void selectBrands() {
		clickAPPLEbox.click();
	}
	public void selectTechnology() {
		click5Gbox.click();
	}
	public void selectRamSize() {
		clickRAMbox.click();
	}
	public void selectBetteryCapacity() {
		clickBATTERYbox.click();
	}
	public void selectScreenSize() {
		clickSCREENbox.click();
	}
	public void selectOperatingSystem() {
		clickSYSTEMbox.click();
	}
	public void selectCamaraReSoultion() {
		clickCEMERAbox.click();
	}
	public void selectSeller() {
		clickSELLERbox.click();
	}
	public void selectSpeed() {
		clickSPEEDbox.click();
	}

}
