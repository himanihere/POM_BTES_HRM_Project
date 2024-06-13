package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;
public class ReportPage extends TestBase{
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Reports']")
	WebElement Report;
	@FindBy(xpath="//span[text()='View Reports']")
	WebElement ViewReports;
	@FindBy(xpath="//span[text()='Define Reports']")
	WebElement DefineReports;
	@FindBy(xpath="//h2[text()=\"View Employee Reports\"]")
	WebElement headingViewEmployeeReport;
	@FindBy(xpath="//h2[text()=\"Define Employee Reports\"]")
	WebElement headingDefineEmployeeReport;

	//constructor call
	public ReportPage(WebDriver driver){	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	//methods
	public void availability_of_reportField() {
		Report.isDisplayed();
	}
	
	public void redirect_cursor_toReportField(){
		 Actions ac= new Actions(driver);
		 ac.moveToElement(Report).perform();;		
	}
	
	public void click_reportField() {
		Report.click();
		
	}
	
	public void to_click_viewReport() {
		 Actions ac= new Actions(driver);
		 ac.moveToElement(Report).moveToElement(ViewReports).click().build().perform();;	
	}
	public void to_click_defineReport() {
		Actions ac= new Actions(driver);
		ac.moveToElement(Report).moveToElement(DefineReports).click().build().perform();;	
	}
	
    public void switchToIframe(){
    	driver.switchTo().frame("rightMenu");
	}
    public void switchBackFromIframe(){
    	driver.switchTo().defaultContent();
	 }
	//for assertion
	public boolean check_reportField() {
		return Report.isDisplayed();
	}
	
	public boolean visibility_of_ViewReport() {
		return ViewReports.isDisplayed();
	}
	
	public boolean viewReport_page() {
		return headingViewEmployeeReport.isDisplayed();	
	}
	
	public boolean defineReport_page() {
		return headingDefineEmployeeReport.isDisplayed();	
	}
	
}
