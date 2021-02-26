package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCompany {
	
	public static final String DASHBOARDURL = "https://bootcamp1.humanity.com/app/dashboard/";
	private static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	public static final String SHIFTPLANNINGURL = "https://bootcamp1.humanity.com/app/schedule/employee/week/overview/overview/25%2c1%2c2021/";
	private static final String SHIFTPLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span";
	public static final String TIMECLOCKURL = "https://bootcamp1.humanity.com/app/timeclock/";
	private static final String TIMECLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	public static final String LEAVEURL = "https://bootcamp1.humanity.com/app/requests/vacation/";
	private static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	public static final String TRAININGURL = "https://bootcamp1.humanity.com/app/training/";
	private static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	public static final String STAFFURL = "https://bootcamp1.humanity.com/app/staff/list/load/true/";
	private static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	public static final String AVAILABILITYURL = "https://bootcamp1.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
	private static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	public static final String PAYROLLURL = "https://bootcamp1.humanity.com/app/payroll/scheduled-hours/";
	private static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]/span";
	public static final String REPORTSURL = "https://bootcamp1.humanity.com/app/reports/dashboard/";
	private static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";
	private static final String ADDEMPLOYEESBTN_XPATH = "//*[@id=\"act_primary\"]";                                                    
	private static final String FIRSTNAME_XPATH = "//*[@id=\"_asf1\"]";
	private static final String LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	private static final String EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	private static final String SAVEBTN_XPATH = "//*[@id=\"_as_save_multiple\"]";
	public static final String ADDSUCCESSURL = "https://bootcamp1.humanity.com/app/staff/assignstaff&new=1&first=6088951/";
	private static final String EDITDETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String EDITFIRSTNAME_XPATH = "//*[@id=\"first_name\"]";
	private static final String SAVECHANGES_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	
	public static void dashboard(WebDriver driver) {
		driver.findElement(By.xpath(DASHBOARD_XPATH)).click();
	}
	
	public static void shiftPlanning(WebDriver driver) {
		driver.findElement(By.xpath(SHIFTPLANNING_XPATH)).click();
	}
	
	public static void timeClock(WebDriver driver) {
		driver.findElement(By.xpath(TIMECLOCK_XPATH)).click();
	}
	
	public static void leave(WebDriver driver) {
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
	}
	
	public static void training(WebDriver driver) {
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
	}
	
	public static void staff(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
	}
	
	public static void availability(WebDriver driver) {
		driver.findElement(By.xpath(AVAILABILITY_XPATH)).click();
	}
	
	public static void payroll(WebDriver driver) {
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
	}
	
	public static void reports(WebDriver driver) {
		driver.findElement(By.xpath(REPORTS_XPATH)).click();
	}
	
	public static void addEmployeesBtn(WebDriver driver) {
		driver.findElement(By.xpath(ADDEMPLOYEESBTN_XPATH)).click();
	}
	
	public static void inputFirstName(WebDriver driver, String firstName) {
		driver.findElement(By.xpath(FIRSTNAME_XPATH)).sendKeys(firstName);
	}
	
	public static void inputLastName(WebDriver driver, String lastName) {
		driver.findElement(By.xpath(LASTNAME_XPATH)).sendKeys(lastName);
	}
	
	public static void inputEmail(WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys(email);
	}
	public static void saveBtn(WebDriver driver) {
		driver.findElement(By.xpath(SAVEBTN_XPATH)).click();
	}
	
	public static void editDetails(WebDriver driver) {
		driver.findElement(By.xpath(EDITDETAILS_XPATH)).click();
	}
	
	public static void editFirstName(WebDriver driver, String firstName1) {
		driver.findElement(By.xpath(EDITFIRSTNAME_XPATH)).sendKeys(firstName1);
	}
	
	public static void saveChangesBtn(WebDriver driver) {
		driver.findElement(By.xpath(SAVECHANGES_XPATH)).click();
	}

 }


