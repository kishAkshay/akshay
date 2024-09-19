package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignemt_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Check the first Checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
		//verify if it is successfully checked
		boolean checkBoxSelected = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println(checkBoxSelected+" The check box is selected");
		// Uncheck it again
		driver.findElement(By.id("checkBoxOption1")).click();
		//verify if it is successfully Unchecked
		boolean checkBoxSelected2 = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println(checkBoxSelected2+" The check box is not selected");
		
		// get the Count of number of check boxes present in the page
		 int CountOfNumberOfCcheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		 System.out.println("The Count of number of check boxes present in the page is "+CountOfNumberOfCcheckBoxes);

	}

}
