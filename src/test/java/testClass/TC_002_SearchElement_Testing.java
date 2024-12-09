package testClass;

import org.testng.annotations.Test;

import pageObjectPage.HomePage;
import pageObjectPage.SearchElement;
import testBase.testclass;

public class TC_002_SearchElement_Testing extends testclass {
	@Test
	public void Testing_SearchElement() throws InterruptedException {
		
		try 
		{
		 
	    logger.info("Starting TC_002_SearchElement_Testing.....");
		HomePage hp=new HomePage(driver);
		logger.info("User Search Product....");
		hp.EnterData();
		
		logger.info("User Select The Product Details....");
		SearchElement  SE=new SearchElement(driver);
		SE.selectDelivery();
		SE.selectStorage();
		SE.selectBrands();
		SE.selectTechnology();
		SE.selectRamSize();
		SE.selectBetteryCapacity();
		SE.selectScreenSize();
		SE.selectOperatingSystem();
		SE.selectCamaraReSoultion();
		SE.selectSeller();
		SE.selectSpeed();
	}
	catch (Exception e) {
		logger.error("Test Is FAILED");
	}
		logger.info("FINISHED TC_002_SearchElement_Testing......");

	}
}
