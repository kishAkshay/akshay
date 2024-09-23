package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assertion_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Rahul";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'name')]")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		String login_msg = driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
		System.out.println(login_msg);
		Assert.assertEquals(login_msg, "You are successfully logged in.");
		String user_name = driver.findElement(By.xpath("//h2[contains(text(),'Hello')]")).getText();
		System.out.println("The user name is "+user_name);
		Assert.assertEquals(user_name, "Hello "+name+",");
		//inspecting the element based on text which is there on the element by using the xpath by text function.
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
		
		
		
	
	}

}
