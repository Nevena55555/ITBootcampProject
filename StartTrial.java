package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartTrial {
	
	public static final String URL = "https://www.humanity.com/wizard-setup2/";
	private static final String NAME1_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String EMAIL1_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	private static final String STARTBTN1_XPATH = "//*[@id=\"free-trial-link-01\"]";
	private static final String EXITPOPUP_XPATH =  "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	private static final String STARTBTN2_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String NAME2_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	private static final String EMAIL2_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	private static final String STARTBTN3_XPATH = "//*[@id=\"popup-free-trial-link\"]";
	
	public static void inputName1(WebDriver driver, String name) {
		driver.findElement(By.xpath(NAME1_XPATH)).sendKeys(name);
	}
	
	public static void inputEmail1(WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL1_XPATH)).sendKeys(email);
	}
	
	public static void clickStartBtn1(WebDriver driver) {
		driver.findElement(By.xpath(STARTBTN1_XPATH)).click();
	}
	
	public static void exitPopUp(WebDriver driver) {
		driver.findElement(By.xpath(EXITPOPUP_XPATH)).click();
	}
	
	public static void clickStartBtn2(WebDriver driver) {
		driver.findElement(By.xpath(STARTBTN2_XPATH)).click();
	}
	
	public static void inputName2(WebDriver driver, String name) {
		driver.findElement(By.xpath(NAME2_XPATH)).sendKeys(name);
	}
	
	public static void inputEmail2(WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL2_XPATH)).sendKeys(email);
	}
	
	public static void clickStartBtn3(WebDriver driver) {
		driver.findElement(By.xpath(STARTBTN3_XPATH)).click();
	}
	

}
