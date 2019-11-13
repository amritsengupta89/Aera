package hotwire_automation_Testcases;


import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import hotwire_automation_base_utils.Hotwire_Test_Base;
import junit.framework.Assert;

public class Search_Test_Cases extends Hotwire_Test_Base
{
	
	@Test
	public void Searchtest() throws Exception{	 

	 assertTrue(homepage.getVacationstab().isDisplayed());
	 homepage.clickOnVacations();
	 assertTrue(homepage.getCarbutton().isDisplayed());
	 homepage.clickOnCarButton();
	 assertTrue(homepage.getFlyFrom().isDisplayed());
	 homepage.setFlyFrom("SFO");
	 Thread.sleep(2000);
	 homepage.SelectFromOption();
	 assertTrue(homepage.getFlyTo().isDisplayed());
	 homepage.setFlyTo("LAX");
	 Thread.sleep(2000);
	 homepage.SelectToOption();
	 assertTrue(homepage.getDepartingDate().isDisplayed());
	 homepage.SetDepartingDate();
	 Thread.sleep(2000);
	 assertTrue(homepage.getReturningDate().isDisplayed());
	 homepage.SetReturningDate();
	 Thread.sleep(3000);
	 assertTrue(homepage.getPickupTime().isDisplayed());
	 homepage.SelectPickupTime();
	 assertTrue(homepage.getDropOffTime().isDisplayed());
	 homepage.SelectDropOffTime();
	 assertTrue(homepage.getFindadeal().isEnabled());
	 homepage.ClickOnFindadeal();
	 Thread.sleep(3000);
	 WebElement myDynamicElement = (new WebDriverWait(driver, 60))
	         .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn-sort tab selected']")));
	 List<WebElement> searchresults = driver.findElements(By.xpath("//div[@id='resultsContainer']/section/article")); 
	 Assert.assertTrue("Search result is present", searchresults.get(1).isDisplayed()); 
	 
	 }
}
