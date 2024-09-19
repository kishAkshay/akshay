package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_browser {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Facebook.com");
		Thread.sleep(2000);
		//driver.close();	// it will close the specific tab or one tab of browser
		String title = driver.getTitle();
		System.out.println("The title of the current page is " +title);
		String url = driver.getCurrentUrl();
		System.out.println("Get the url of the current page " +url);
		String pageSource = driver.getPageSource();
		System.out.println("The page source of current page " +pageSource);
		driver.quit(); // it will close the complete browsers

				
	}

}
