package Handling_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		String name = "Akshay";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		Alert confirmationPopUp = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = confirmationPopUp.getText();
		System.out.println(text);
		confirmationPopUp.dismiss();

	}

}
