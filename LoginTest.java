package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.Login;

public class LoginTest {
	
    private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nevena/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testLogin() {
		driver.navigate().to(HomePage.URL);
		driver.navigate().to(Login.URL);
		Login.inputEmailUsername(driver, "mara@bootcamp.com");
		Login.inputPassword(driver, "pasvord");
		Login.loginBtn(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = Login.LOGINSUCCESS;
		
		Assert.assertEquals(actual, expected);
	
	}
	
}
