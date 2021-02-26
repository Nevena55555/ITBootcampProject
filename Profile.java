package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Profile {
	
	private static final String ARROW_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
	private static final String EDITDETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String NICKNAME_XPATH = "//*[@id=\"nick_name\"]";
	private static final String SAVEEMPLOYEE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	//private static final String GENDERDD_XPATH = "//*[@id=\"gender\"]";
	private static final String DEFAULTLOCATION_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[38]/td/div/div[2]/ul/li[1]/input";
	
	public static void arrow(WebDriver driver) {
		driver.findElement(By.xpath(ARROW_XPATH)).click();
	}
	
	public static void profile(WebDriver driver) {
		driver.findElement(By.partialLinkText("Profile")).click();
	}
	
	public static void editDetails(WebDriver driver) {
		driver.findElement(By.xpath(EDITDETAILS_XPATH)).click();
	}
	
	public static void inputNickname(WebDriver driver, String nickname) {
		driver.findElement(By.xpath(NICKNAME_XPATH)).sendKeys(nickname);
	}
	
	public static void saveEmployee(WebDriver driver) {
		driver.findElement(By.xpath(SAVEEMPLOYEE_XPATH)).click();
	}
	
	public static void uncheckDefaultLocation(WebDriver driver) {
		driver.findElement(By.xpath(DEFAULTLOCATION_XPATH)).click();
	}
	
	/*public static void genderDropDown(WebDriver driver) {
		driver.findElement(By.xpath(GENDERDD_XPATH)).click();
	}
	
	public static void chooseGender(WebDriver driver) {
		WebElement language = driver.findElement(By.xpath(GENDERDD_XPATH));
	    Select sel = new Select(language);
	    sel.selectByVisibleText("Female");
	}*/
	

}
