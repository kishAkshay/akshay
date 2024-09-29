package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_CheckBoxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		boolean checkBoxSelected = driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected();
		System.out.println(checkBoxSelected);
		driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
		boolean checkBoxSelected2 = driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected();
		System.out.println(checkBoxSelected2);
		
		//count of number of checkboxes
		int countOfCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("The total number of checkboxes in current page is "+ countOfCheckBoxes);
		

	}

}
