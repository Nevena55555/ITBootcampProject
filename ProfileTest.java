package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.Login;
import objects.Profile;

public class ProfileTest {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nevena/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void addNickname() {
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
		
		Profile.arrow(driver);
		Profile.profile(driver);
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Profile.editDetails(driver);
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Profile.inputNickname(driver, "Marica");
		Profile.saveEmployee(driver);
		
		
	}
	
	@Test
	public void changePositionAssignments() {
		
		Profile.uncheckDefaultLocation(driver);
		Profile.saveEmployee(driver);
		
	}
	
		

}
