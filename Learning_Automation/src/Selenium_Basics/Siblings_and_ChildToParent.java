package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings_and_ChildToParent {

	public static void main(String[] args) {
		// Siblings function and child to parent travel
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String ButtonText = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(ButtonText);
		String ButtonText2 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText();
		System.out.println(ButtonText2);
	}
	

}
