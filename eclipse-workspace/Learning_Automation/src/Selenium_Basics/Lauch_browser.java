package Selenium_Basics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch_browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		@Nullable
		String TitleOfPage = driver.getTitle();
		System.out.println(TitleOfPage);
		@Nullable
		String CurrenturlOfPage = driver.getCurrentUrl();
		System.out.println(CurrenturlOfPage);
		@Nullable
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		*/
		
		//Launch the fire fox browser
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/");
		 
		
		
		 
		 
		
	}

}
