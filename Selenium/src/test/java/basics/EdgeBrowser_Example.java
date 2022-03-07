package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowser_Example {
	public WebDriver driver;
  @Test
  public void testEdgeBrowser_Example() {
	  driver.get("https://mvnrepository.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  //instantiate browser
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
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
