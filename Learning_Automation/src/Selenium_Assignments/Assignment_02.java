package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_02 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Akshay");
		driver.findElement(By.name("email")).sendKeys("akshay@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("AK@#123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Gender_dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(Gender_dropdown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("05-10-1997");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		String successfullmsg = driver.findElement(By.className("alert-success")).getText();
		System.out.println(successfullmsg);
	}

}
