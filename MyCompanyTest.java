package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.HomePage;
import objects.Login;
import objects.MyCompany;

public class MyCompanyTest {
	
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nevena/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 1)
	public void testShiftPlanning() {
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
		MyCompany.shiftPlanning(driver);
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.SHIFTPLANNINGURL;
		
		Assert.assertEquals(actual, expected);
	
	}
	
	@Test(priority = 2)
	public void testDashboard() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.dashboard(driver);
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.DASHBOARDURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 3)
	public void testTimeClock() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.timeClock(driver);
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.TIMECLOCKURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 4)
	public void testLeave() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.leave(driver);
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.LEAVEURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5)
	public void testTraining() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.training(driver);
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.TRAININGURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 6)
	public void testStaff() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyCompany.staff(driver);
		
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.STAFFURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7)
	public void testAddEmployees() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyCompany.addEmployeesBtn(driver);
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.inputFirstName(driver, "steva");
		MyCompany.inputLastName(driver, "stevic");
		MyCompany.inputEmail(driver, "steva@gmail.com");
		MyCompany.saveBtn(driver);
		
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.ADDSUCCESSURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 8)
	public void changeName() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.staff(driver);
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.partialLinkText("steva")).click();
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.editDetails(driver);
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.editFirstName(driver, "n");
		MyCompany.saveChangesBtn(driver);
		
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyCompany.staff(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.STAFFURL;
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(priority = 9)
	public void addFromExcel() {
		
        File f = new File("kredencijali.xlsx");
		
		try {
			InputStream inp = new FileInputStream(f); 
			XSSFWorkbook wb = new XSSFWorkbook(inp); 
			Sheet sheet = wb.getSheetAt(0); 
			
			SoftAssert sa = new SoftAssert();
			
			MyCompany.staff(driver);
			try{
				Thread.sleep(3000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i = 0; i < 5; i++) {
			
			Row row = sheet.getRow(i);
			
			Cell c1 = row.getCell(0);
			Cell c2 = row.getCell(1);
			Cell c3 = row.getCell(2);
			
		    String firstName = c1.toString();
			String lastName = c2.toString();
			String email = c3.toString();
		    
		    MyCompany.addEmployeesBtn(driver);
		    try{
				Thread.sleep(3000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    MyCompany.inputFirstName(driver, firstName);
		    MyCompany.inputLastName(driver, lastName);
		    MyCompany.inputEmail(driver, email);
		    MyCompany.saveBtn(driver);
		    try{
				Thread.sleep(3000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		    String actual  = driver.getCurrentUrl();
		    String expected = MyCompany.ADDSUCCESSURL;
		    
		    sa.assertEquals(actual, expected);
		    
			}
			
			MyCompany.staff(driver);
			
			sa.assertAll();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	@Test(priority = 12)
	public void testAvailability() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.availability(driver);
		
		try{
			Thread.sleep(10000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.AVAILABILITYURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 10)
	public void testPayroll() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyCompany.payroll(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.PAYROLLURL;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 11)
	public void testReports() {
		try{
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyCompany.reports(driver);
		String actual = driver.getCurrentUrl();
		String expected = MyCompany.REPORTSURL;
		
		Assert.assertEquals(actual, expected);
	}
	
}
