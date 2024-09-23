package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dynamic_DD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		if we want to select the element without using index, 
		  then we go for xpath by parent to child travel or xpath by parent child relationship*/
		/*//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']---> this is parent xpath
		//a[@value='MAA']---> this is child xpath
		 * 1st need to find the parent element then need to find the child element 
		 * here selenium will find the child element inside the parent element only not in entire browser
		 */
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		 

	}

}
