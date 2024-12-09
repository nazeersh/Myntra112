package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends basepage {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(name = "customerName")
	WebElement txtcustname;
	
	@FindBy(name = "email")
	WebElement txtemail;
	
	@FindBy(name = "password")
	WebElement txtPass;
	
	@FindBy(id = "continue")
	WebElement clickContinue;
	
	public void setCustomerName(String name) {
		txtcustname.sendKeys(name);
		System.out.println(txtcustname.getAttribute("value"));
	}
	public void setEmail(String email) {
		txtemail.sendKeys(email);
		System.out.println(txtemail.getAttribute("value"));
	}
	public void setPassword(String pass) {
		txtPass.sendKeys(pass);
		System.out.println(txtPass.getAttribute("value"));
	}
	public void ClickOnContinue() {
		clickContinue.click();
	}

}
