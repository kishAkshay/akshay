package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handle_checkBox_UsingAssertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		boolean checkBoxSelected = driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected();
		Assert.assertFalse(checkBoxSelected);
		//assertfalse function will expect only false in argument
		driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
		boolean checkBoxSelected2 = driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected();
		Assert.assertTrue(checkBoxSelected2);
		//asserttrue function will expect only true in argument
		//count of number of checkboxes by using assertion
		int countOfCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		Assert.assertEquals(countOfCheckBoxes, 6);
		/*assertequal will have two argument i'e actual and expected value
		 * actual : the value which is return by the selenium 
		 * expected : the value which is you want 
		 */


	}

}
