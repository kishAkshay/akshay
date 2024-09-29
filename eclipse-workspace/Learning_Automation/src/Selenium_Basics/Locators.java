package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Akshay");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul@#123");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
	String ErrorMessage = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(ErrorMessage);
		driver.findElement(By.linkText("Forgot your password?")).click();
		//xpath by Attributes
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Akshay Mandekar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("akshaymandekar61@gmail.com");
		//Relative xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7892113326");
		//xpath by text function
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String infoText = driver.findElement(By.className("infoMsg")).getText();
		System.out.println(infoText);
		// xpath by partially dynamic text
		driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		String login_mess = driver.findElement(By.xpath("//p[contains(text(),'successfully')]")).getText();
		System.out.println(login_mess);
		//xpath by partially dynamic element
		driver.findElement(By.xpath("//button[contains(@class,'btn')]")).click();
		
	}

}
