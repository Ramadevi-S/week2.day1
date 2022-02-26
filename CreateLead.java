package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//setting_up Web_driver
		WebDriverManager.chromedriver().setup();
		// creating object for web_driver
		ChromeDriver driver = new ChromeDriver();
		// launching an web_site
		driver.get("http://leaftaps.com/opentaps/control/main");
		// maximizing the window
		driver.manage().window().maximize();
		// Entering user_name
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		// Entering password
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		// clicking the button
		WebElement elementButton = driver.findElement(By.className("decorativeSubmit"));
		elementButton.click();
		// clicking the CRM_SFA
		WebElement elementCrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		elementCrmsfa.click();
		// clicking the leads
		WebElement elementLead = driver.findElement(By.linkText("Leads"));
		elementLead.click();
		// clicking create_leads
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		// Entering company name
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Dhanvika pvt ltd");
		// Entering first_name
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Ramadevi");
		// Entering last_name
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Sankaralingam");
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Rama");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramadevikmhss@gmail.com");
		WebElement elementDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(elementDropdown);
		dropdown.selectByVisibleText("New York");
		// clicking the create_lead button
		WebElement elementLeadClick = driver.findElement(By.className("smallSubmit"));
		elementLeadClick.click();
		String OurTitle = driver.getTitle();
		System.out.println(OurTitle);
	
	}

}
