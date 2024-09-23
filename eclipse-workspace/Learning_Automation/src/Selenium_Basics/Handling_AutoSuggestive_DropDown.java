package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_AutoSuggestive_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));//based on this xpath 3 element we found and stored in veriable 
		
		for (WebElement option : options) {  // for each loop is for store the element in option veriable one by one
			if(option.getText().equalsIgnoreCase("India"))// we will get the text of that element and compare with other text
			{
				option.click();  // if it is matches perform the click action
				break;
			}
		}

	}

}
