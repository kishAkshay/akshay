package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Enable_Disable_element {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		String attribute_value = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(attribute_value);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		String changed_Attribute = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(changed_Attribute);
		
		if (attribute_value.contains("0.5")){
			System.out.println("it is enabled");
		} else {
			System.out.println("it is disabled");
		}

	}

}
