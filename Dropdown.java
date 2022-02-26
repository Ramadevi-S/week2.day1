package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		//setting_up Web_driver
				WebDriverManager.chromedriver().setup();
				// creating object for web_driver
				ChromeDriver driver = new ChromeDriver();
				// launching an web_site
				driver.get("http://www.leafground.com/pages/Dropdown.html");
				// maximizing the window
				driver.manage().window().maximize();
				WebElement elementIndex = driver.findElement(By.id("dropdown1"));
				Select dropdown = new Select(elementIndex);
				dropdown.selectByIndex(2);
				WebElement elementText = driver.findElement(By.name("dropdown2"));
				Select dropdown1 = new Select(elementText);
				dropdown1.selectByVisibleText("Selenium");
				WebElement elementValue = driver.findElement(By.name("dropdown3"));
				Select dropdown2 = new Select(elementValue);
				dropdown2.selectByValue("4");
				//driver.findElement(By.linkText("You can also use sendKeys to select")).sendKeys("Selenium");
				WebElement elementValue1 = driver.findElement(By.linkText("You can also use sendKeys to select"));
				Select dropdown3 = new Select(elementValue1);
				dropdown3.selectByValue("1");
				
				
				
				
				
	}

}
