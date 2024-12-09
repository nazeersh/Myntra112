package pageObjectPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basepage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement clickacc;
	
	@FindBy(xpath = "(//span[text()='Sign in'])[1]")
	WebElement clicksign;
	
	@FindBy(id = "createAccountSubmit")
	WebElement clickcrtAcc;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement txtsearch;
	
	
	
	public void ClickOnAccount() {
		Actions actobj=new Actions(driver);
		actobj.moveToElement(clickacc).perform();;
	}
	public void ClickOnSignIn() {
		clicksign.click();
	}
	public void ClickOnCreateAcc() {
		clickcrtAcc.click();
	}
	public void EnterData() throws InterruptedException {
		Actions actobj1=new Actions(driver);
		actobj1.sendKeys(txtsearch,"iphone").perform();
		for(int i=0;i<=3;i++) {
			actobj1.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		actobj1.sendKeys(Keys.ENTER).perform();
	}

}
