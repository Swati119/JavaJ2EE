package selenium.automationFramework.chromedriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

		public class Chromedriver {

			WebDriver driver;
			
/**
 * Or Use local path in pc folders:
 * System.setProperty("webdriver.chrome.driver","/Users/path/Documents/path/libs/chromedriver");
 * 			
 */
			
			@Test
			public void setup() {
						
				File f = new File("chromedriver.exe");
			    System.setProperty("webdriver.chrome.driver",f.getAbsolutePath());     
     
				 WebDriver driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				 String url= "https://www.google.com/?gws_rd=ssl";
				 driver.get(url);
		
				 String Actual = driver.getCurrentUrl();
				 String Expected= "https://www.google.com/?gws_rd=ssl";
				 
				 Assert.assertEquals(Actual, Expected);
				 System.out.println( "The URL for this site is " + Actual);
			
			}
				 
			
					@Test
					public void teardown() {
					WebDriver driver = new ChromeDriver();
					driver.quit();
		
			}
		
				 
	}
