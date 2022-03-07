package basics;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class ChromeBrowser_Example{
	public WebDriver driver;
	@Test
	public void testChromeBrowser_Example() {
		  driver.get("https://mvnrepository.com/");
			 
	  }
	  @BeforeClass
	  public void beforeClass() {
		  // INITIATE BROWSER
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  // maximize the browser
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
		  //close browser
		  driver.quit();
	  }

}
