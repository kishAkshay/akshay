package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Handling the "COUNTRY" dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));//based on this xpath 3 element we found and stored in veriable 
		
		for (WebElement option : options) {  // for each loop is for store the element in option veriable one by one
			if(option.getText().equalsIgnoreCase("India"))// we will get the text of that element and compare with other text
			{
				option.click();  // if it is matches perform the click action
				break;
			}
		}
		//Handling the "CHECK BOX" 
		driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
		//Handling the "FORM" text field
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//Handling the "TO" text field
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//Handling the "DEPART DATE" CANLENDER
		driver.findElement(By.className("ui-state-highlight")).click();
		//Handling the "RETURN DATE" CANLENDER
		String changed_Attribute = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(changed_Attribute);
		
		if (changed_Attribute.contains("0.5")){
			System.out.println("it is enabled");
		} else {
			System.out.println("it is disabled");
			
		}
		//Handling the "PASSENGERS" DROP DOWN
		WebElement Updated_DD = driver.findElement(By.id("divpaxinfo"));
		System.out.println(Updated_DD.getText());
		Updated_DD.click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(Updated_DD.getText());
		//Handling the "CURRENCY" DROP DOWN
		WebElement SingleSelectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(SingleSelectdropdown);
		dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("AED");
		//Handling the "SEARCH" button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
