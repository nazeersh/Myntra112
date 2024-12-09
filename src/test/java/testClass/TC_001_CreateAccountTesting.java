package testClass;

import org.testng.annotations.Test;

import pageObjectPage.CreateAccountPage;
import pageObjectPage.HomePage;
import testBase.testclass;

public class TC_001_CreateAccountTesting extends testclass{
	@Test
	public void TestingCreateAcc() {
		try {
			
	   logger.info("STARTING TC_001_CreateAccountTesting .......");
		HomePage hp=new HomePage(driver);
		logger.info("ClickOnAccount.....");
		hp.ClickOnAccount();
		logger.info("ClickOnSignIn....");
		hp.ClickOnSignIn();
		logger.info("ClickOnCreateAcc....");
		hp.ClickOnCreateAcc();
		
		logger.info("User wiil Enter Login Details...");
		CreateAccountPage acpage=new CreateAccountPage(driver);
		acpage.setCustomerName("shaiknazeer");
		acpage.setEmail("nazeershaik1823@gmail.com");
		acpage.setPassword("121212");
		acpage.ClickOnContinue();
		}
		catch (Exception e) {
			logger.error("Test is FAILED");
		}
	}

}
