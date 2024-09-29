package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamically_send_PWD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'pwd')]")).click();
		Thread.sleep(2000);
		String password = getpassword(driver);
		driver.findElement(By.xpath("//button[contains(@class,'go')]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
	}
	public static String getpassword(WebDriver driver) {
		String passwordText = driver.findElement(By.className("infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordText1 = passwordText.split("'");	// it will split the text based on the single quote and store in array
		
		//index 0th -- Please use temporary password 
		//index 1st -- rahulshettyacademy' to Login.
		String[] passwordText2 = passwordText1[1].split("'");  // it will again split the text which is there in 1st index, based on the single quote and store in array
		
		//index 0th -- rahulshettyacademy
		//index 1st -- to Login.
		String Password = passwordText2[0];
		
		
		return Password;
	}
		
		
}
