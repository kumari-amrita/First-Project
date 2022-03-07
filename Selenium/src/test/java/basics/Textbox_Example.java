package basics;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Textbox_Example {
	public WebDriver driver;
  @Test
  public void testTextbox_Example() throws Exception {
	  driver.get("https://mvnrepository.com/");
	  //type some text in search box
	  driver.findElement(By.id("query")).sendKeys("webdrivermanager");
	  Thread.sleep(5000);
  }
  @BeforeClass
  public void beforeClass() {
	  //instantiate browser
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  //maximize browser
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  //close browser
	  driver.quit();
  }

}
