package Selenium_Basics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleProductToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot", "Capsicum", "Banana" };

		selectItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Thread.sleep(5000);
		String promoInfo = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println(promoInfo);

	}

	public static void selectItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		// Get all the products which is showing in webpage.
		List<WebElement> productsName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < productsName.size(); i++) {
			// Get all the text of the products.
			String Text = productsName.get(i).getText();
			// split the text because it contains "Brocolli - 1 Kg", we just want name of
			// the item.
			String[] splitedText = Text.split("-");
			/*
			 * actualProductName[0] --> Brocolli actualProductName[1] -->1 Kg
			 */
			// trim will remove the space
			String actualProductName = splitedText[0].trim();
			// convert the array to array list.

			List itemsNeededList = Arrays.asList(itemsNeeded);
			// Check whether text of product which is extracted from the webpage which is
			// present in the arraylist or not.
			if (itemsNeededList.contains(actualProductName)) {
				j++;
				// Click on add to cart button by using the relative xpath. don't use the text
				// because it is getting change after click.
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
	}

}
