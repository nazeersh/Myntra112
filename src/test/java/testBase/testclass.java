package testBase;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class testclass {
	public WebDriver driver;
	public Logger logger;
	@Parameters({"OS","browsername"})
	@BeforeClass
	public void setUp(String os,String br) {
		
		logger=LogManager.getLogger(this.getClass());
		
		switch (br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge" : driver=new EdgeDriver();break;
		case "firefox" : driver=new FirefoxDriver();break;
		default: System.out.println("Browser Name Is Not MissMatched");
		
		}
		
		//driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}

}
