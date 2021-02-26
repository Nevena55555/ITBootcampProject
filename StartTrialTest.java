package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.StartTrial;

public class StartTrialTest {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nevena/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testStartTrial1() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();
		StartTrial.inputName1(driver, "Mara Maric"); //potrebno menjati pri testiranju
		StartTrial.inputEmail1(driver, "marab@bootcamp.com"); // -||-
		StartTrial.exitPopUp(driver);
		StartTrial.clickStartBtn1(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = HomePage.URL;
		
		Assert.assertEquals(actual, expected); 
	}
	
	@Test
	public void testStartTrial2() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();
		//StartTrial.exitPopUp(driver); //nekad potrebno, nekad ne
		StartTrial.clickStartBtn2(driver);
		StartTrial.inputName2(driver, "Steva Stevic"); //potrebno menjati 
		StartTrial.inputEmail2(driver, "steva@gmail.com"); // -||-
		StartTrial.clickStartBtn3(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = HomePage.URL;
		
		Assert.assertEquals(actual, expected); 
	}


}
