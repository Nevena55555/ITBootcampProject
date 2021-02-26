package tests;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.Screenshot;
import objects.StartTrial;

public class ScreenshotTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nevena/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void goToPageAboutUs() {
		driver.navigate().to(HomePage.URL);
		StartTrial.exitPopUp(driver);
		Screenshot.aboutUs(driver);
	    driver.findElement(By.partialLinkText("About Us")).click();
	    
	    String actual  = driver.getCurrentUrl();
	    String expected = Screenshot.URL;
			
	    Assert.assertEquals(actual, expected);
	  
	}
	
	@AfterTest
	public void takeScreenshot() {
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(src, new File("/Users/Nevena/Desktop"));
	   
	  
	}

}
