package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;
public class ViewReportPage extends TestBase {
	WebDriver driver;
	
	@FindBy(xpath="//select[@id=\"loc_code\"]")
	WebElement SrchByBox;
	
	@FindBy(xpath="//option[text()='-Select-']")
	WebElement SelectOption;
	
	@FindBy(xpath="//option[text()='ID']")
	WebElement IDOption;
	
	@FindBy(xpath="//option[text()='Name']")
	WebElement NameOption;
	
	@FindBy(xpath="//label[text()='Search For:']")
	WebElement SearchFor;
	
	@FindBy(id="loc_name")
	WebElement SrchForInputBox;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement SearchButton;
	
	@FindBy(xpath="//input[@value='Reset']")
	WebElement ResetButton;
	
	@FindBy(xpath="//a[text()=\"REP010\"]")
	WebElement linkTextREP010;
	
	@FindBy(xpath="//td[text()=\"All Reports\"]")
	WebElement tableDataAllReport;
	
	@FindBy(xpath="//input[@value='Back']")
	WebElement BackButton;
	
	@FindBy(xpath="//div[text()=\"No Records to Display !\"]")
	WebElement noMatchAlert;
	
	@FindBy(xpath="//h2[text()=\"View Employee Reports\"]")
	WebElement headingViewEmployeeReport;
		
	//constructor call
    public ViewReportPage(WebDriver driver){
    	this.driver = driver;
	    PageFactory.initElements(driver, this);
	}	
    
    //method  
    public void switchToIframe(){
    	driver.switchTo().frame("rightMenu");
    }
    
    public void switchBackFromIframe(){
    	driver.switchTo().defaultContent();
    }
    
    public void clickOn_SearchBy_selectBox(){
    	SrchByBox.click();  	
    }
    
    public void toSelect_idOption(){
    	IDOption.click();   	  	
    }
    
    public void toSelect_nameOption(){
    	NameOption.click();   	  	
    }
    
    public void toselect_SearchForText(){
    	SearchFor.click();   	  	
    }
    
    public void toselect_SearchForInputBox(){
    	SrchForInputBox.click();   	  	
    }
    
    public void toEnter_SearchForInput(String value){
    	SrchForInputBox.sendKeys(value);;   	  	
    }
    
    
    public void toClick_SearchButton(){
    	SearchButton.click();   	  	
    }
    
    public void toClick_ResetButton(){
    	ResetButton.click();   	  	
    }
    
    public void toClick_ReportIDLink(){
    	linkTextREP010.click();   	  	
    }
    
    public void toClick_BackButton(){
    	BackButton.click();   	  	
    }
    
    //for assertion
    public boolean id_optionAvailability() {
    	return IDOption.isDisplayed();
    }
    
    public boolean select_optionAvailability() {
    	return SelectOption.isDisplayed();
    }
    
    public boolean searchFor_inputBox_availability() {
    	return SrchForInputBox.isDisplayed();
    }
    
    public boolean availability_of_reportID() {
    	return linkTextREP010.isDisplayed();
    }
    
    public boolean alertMessage() {
    	return noMatchAlert.isDisplayed();
    }
    
    public boolean availability_of_reportName() {
    	return tableDataAllReport.isDisplayed();
    }
    
    public boolean availability_of_backButton() {
    	return BackButton.isDisplayed();
    }
    
    public boolean viewReport_page() {
		return headingViewEmployeeReport.isDisplayed();	
	}
}
