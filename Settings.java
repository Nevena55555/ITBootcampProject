package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Settings {
	
	private static final String ARROW_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
	private static final String LANGUAGEDD_XPATH = "//*[@id=\"language\"]";
	private static final String SAVEEMPLOYEEBTN_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	private static final String SETTINGSBTN_XPATH = "//*[@id=\"sn_admin\"]/span";
	private static final String VIAEMAIL_XPATH = "//*[@id=\"pref_pref_email\"]";
	private static final String VIASMS_XPATH = "//*[@id=\"pref_pref_sms\"]";
	private static final String VIAMOBILE_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
	private static final String SAVESETTINGS_XPATH = "//*[@id=\"act_primary\"]";
	
	public static void arrow(WebDriver driver) {
		driver.findElement(By.xpath(ARROW_XPATH)).click();
	}
	
	public static void settings(WebDriver driver) {
		driver.findElement(By.partialLinkText("Settings")).click();
	}
	
	public static void dropDown(WebDriver driver) {
		driver.findElement(By.xpath(LANGUAGEDD_XPATH)).click();
	}
	
	public static void chooseLanguage(WebDriver driver) {
		WebElement language = driver.findElement(By.xpath(LANGUAGEDD_XPATH));
	    Select sel = new Select(language);
	    sel.selectByVisibleText("Arabic (machine)");
	    
	}
	
	public static void saveEmployeeBtn(WebDriver driver) {
		driver.findElement(By.xpath(SAVEEMPLOYEEBTN_XPATH)).click();
	}
	
	public static void settingsBtn(WebDriver driver) {
		driver.findElement(By.xpath(SETTINGSBTN_XPATH)).click();
	}
	
	public static void disableEmail(WebDriver driver) {
		driver.findElement(By.xpath(VIAEMAIL_XPATH)).click();
	}
	
	public static void disableSms(WebDriver driver) {
		driver.findElement(By.xpath(VIASMS_XPATH)).click();
	}
	
	public static void disableMobile(WebDriver driver) {
		driver.findElement(By.xpath(VIAMOBILE_XPATH)).click();
	}
	
	public static void saveSettings(WebDriver driver) {
		driver.findElement(By.xpath(SAVESETTINGS_XPATH)).click();
	}
	
	

}
