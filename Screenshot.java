package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Screenshot {
	
	public static final String URL = "https://www.humanity.com/about";
	private static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";

	public static void aboutUs(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUS_XPATH)).click();
	}
	
	
}
