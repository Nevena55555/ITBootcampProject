package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.Login;
import objects.Settings;

public class SettingsTest {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nevena/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 1)
	public void changeLanguage() {
		driver.navigate().to(HomePage.URL);
		
		driver.navigate().to(Login.URL);
		Login.inputEmailUsername(driver, "mara@bootcamp.com");
		Login.inputPassword(driver, "pasvord");
		Login.loginBtn(driver);
		
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Settings.arrow(driver);
		Settings.settings(driver);
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Settings.dropDown(driver);
		Settings.chooseLanguage(driver);
		Settings.saveEmployeeBtn(driver);
		
	}
	@Test(priority = 2)
	public void disableNotifications() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Settings.settingsBtn(driver);
		driver.manage().window().fullscreen();
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Settings.disableEmail(driver);
		Settings.disableSms(driver);
		Settings.disableMobile(driver);
		Settings.saveSettings(driver);
	}
	
	

}
