package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static final String URL = "https://www.humanity.com/app/";
	private static final String EMAILUSERNAME_XPATH = "//*[@id=\"email\"]";
	private static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
	private static final String LOGINBTN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	public static final String LOGINSUCCESS = "https://www.humanity.com/app/";
	
	public static void inputEmailUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath(EMAILUSERNAME_XPATH)).sendKeys(username);
	}
	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys(password);
	}
	
	public static void loginBtn(WebDriver driver) {
		driver.findElement(By.xpath(LOGINBTN_XPATH)).click();
	}

}
