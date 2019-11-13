package hotwire_automation_base_utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import hotwire_automation_webpages.Hotwire_serach_page;

public class Hotwire_Test_Base {
	
	public static WebDriver driver;
	 protected Hotwire_serach_page homepage;
	 
	 @BeforeSuite
	 public void initialize() throws IOException{
		   String Chromepath = System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver",Chromepath + "//chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("https://www.hotwire.com/");
	       homepage= PageFactory.initElements(driver, Hotwire_serach_page.class);
	      
	 }
	 
	 @AfterSuite
	 public void TeardownTest()
	    {
		 Hotwire_Test_Base.driver.quit();
	    }
	 

}
