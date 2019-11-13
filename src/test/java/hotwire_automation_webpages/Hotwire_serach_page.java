package hotwire_automation_webpages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import hotwire_automation_base_utils.Hotwire_Test_Base;

public class Hotwire_serach_page extends Hotwire_Test_Base {


	// Using FindBy for locating elements 
	@FindBy(how = How.XPATH, using = "//div[@class='container-fluid']/ul/li[4]/a")
	WebElement vacationstab;

	@FindBy(how = How.XPATH, using = "//button[@class='hw-btn hw-btn-check']")
	private WebElement carbutton;

	@FindBy(id = "farefinder-package-origin-location-input")
	private WebElement FlyFrom;

	@FindBy(id = "farefinder-package-destination-location-input")
	private WebElement FlyTo;

	@FindBy(id = "farefinder-package-startdate-input")
	private WebElement DepartingDate;

	@FindBy(id = "farefinder-package-enddate-input")
	private WebElement ReturningDate;

	@FindBy(id = "farefinder-package-pickuptime-input")
	private WebElement PickupTime;

	@FindBy(id = "farefinder-package-dropofftime-input")
	private WebElement DropOffTime;

	@FindBy(how = How.XPATH, using = "//button[@id='farefinder-package-search-button']")
	private WebElement Findadeal;
	
	/*@FindBy(how = How.XPATH, using = "//div[@class='flex-link-wrap']/a")
	private WebElement Searchresult;
	*/
	
	@FindBy(how = How.XPATH, using = "//div[@id='paginationContainer']/div/nav/fieldset/p")
	private WebElement Searchresult;
	

	// Getter methods for all web elements
	public WebElement getVacationstab() {
		return vacationstab;
	}

	public WebElement getCarbutton() {
		return carbutton;
	}

	public WebElement getFlyFrom() {
		return FlyFrom;
	}

	public WebElement getFlyTo() {
		return FlyTo;
	}

	public WebElement getDepartingDate() {
		return DepartingDate;
	}

	public WebElement getReturningDate() {
		return ReturningDate;
	}

	public WebElement getPickupTime() {
		return PickupTime;
	}

	public WebElement getDropOffTime() {
		return DropOffTime;
	}

	public WebElement getFindadeal() {
		return Findadeal;
	}
	
	public WebElement getSearchresult() {
		Searchresult.getText();
		return Searchresult;
	}

	// Setter methods for all web elements

	public void setFlyFrom(String From) {
		FlyFrom.clear();
		FlyFrom.sendKeys(From);
	}

	public void SelectFromOption() {
		FlyFrom.sendKeys(Keys.TAB);
	}

	public void setFlyTo(String To) {

		FlyTo.clear();
		FlyTo.sendKeys(To);
	}

	public void SelectToOption() {
		FlyTo.sendKeys(Keys.TAB);
	}

	// Required functions

	public void clickOnVacations() {
		vacationstab.click();
	}

	public void clickOnCarButton() {
		carbutton.click();
	}

	public void SelectDropOffTime() {
		DropOffTime.click();
		Select select = new Select(DropOffTime);
		select.selectByVisibleText("Evening");
	}

	public void SelectPickupTime() {
		PickupTime.click();
		Select select = new Select(PickupTime);
		select.selectByVisibleText("Morning");
	}

	public void ClickOnFindadeal() {
		Findadeal.click();
	}

	public String nextday() {
		String nexday = "";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(cal.DAY_OF_YEAR, 1);
		d = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		nexday = formatter.format(d);
		return nexday;
	}

	public String ThreeWeeksAfter() {
		String ThreeWeeksAfter = "";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(cal.DAY_OF_YEAR, 22);
		d = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		ThreeWeeksAfter = formatter.format(d);
		return ThreeWeeksAfter;
	}

	public void SetDepartingDate() {
		DepartingDate.click();
		DepartingDate.clear();
		DepartingDate.sendKeys(nextday());
		DepartingDate.sendKeys(Keys.TAB);
	}
	

	public void SetReturningDate() {
		ReturningDate.click();
		ReturningDate.clear();
		ReturningDate.sendKeys(ThreeWeeksAfter());
		DepartingDate.sendKeys(Keys.TAB);
	}

}
