package test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DefineReportPage;
import pages.ReportPage;
import testBase.TestBase;
public class DefineReportTest extends TestBase{
	//LoginPage LP;
	ReportPage RP;
	DefineReportPage DRP;
	public DefineReportTest() {
		super();	
	}
	@BeforeClass
	public void setup() throws IOException
	{
		//initialize();
		//LP= new LoginPage(driver);
		RP= new ReportPage(driver);
	   // LP.login(prop.getProperty("user1"),prop.getProperty("pass1"));
		RP.to_click_defineReport();
		DRP= new DefineReportPage(driver); 
	}	
	@Test(priority=33)
    public void Functionality_of_SearchBy_field_by_clicking_on_selectBox() {
		//switch to iframe
		DRP.switchToIframe();
		DRP.clickOn_SearchBy_selectBox();
		AssertJUnit.assertEquals(DRP.id_optionAvailability(), true);
		DRP.switchBackFromIframe();
    }	
	@Test(priority=34)
	public void Validate_functionality_of_SearchButton_without_input(){
		DRP.switchToIframe();
		DRP.toClick_SearchButton();
		DRP.switchBackFromIframe();
	}	
	@Test(priority=35)
	public void Validate_default_input_for_SelectBox() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		AssertJUnit.assertEquals(DRP.select_optionAvailability(), true);
		DRP.switchBackFromIframe();

	}
	@Test(priority=36)
	public void validate_functionality_of_SearchForField_when_clickOn_SearchFor_text() {
		DRP.switchToIframe();
		DRP.toselect_SearchForText();
		AssertJUnit.assertEquals(DRP.searchFor_inputBox_availability(), true);
		DRP.switchBackFromIframe();
	}
	@Test(priority=37)
	public void validate_the_functionality_of_SearchFor_field_when_clickOn_inputBox() {
		DRP.switchToIframe();
		DRP.toselect_SearchForInputBox();
		AssertJUnit.assertEquals(DRP.searchFor_inputBox_availability(), true);
		DRP.switchBackFromIframe();
	}
	@Test(priority=38)
	public void validate_functionality_of_SearchButton_without_searchByFieldSelection_andEntervalReportID_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toEnter_SearchForInput(prop.getProperty("validReportID"));
		DRP.toClick_SearchButton();
		DRP.switchBackFromIframe();
	}
	@Test(priority=39)
	public void validate_functionality_Search_button_without_SearchByField_selection_and_entervalReportName_in_SearchFor_inputField(){
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		DRP.toClick_SearchButton();
		DRP.switchBackFromIframe();
	}
	@Test(priority=40)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_andEnter_ReportID_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_idOption();
		DRP.toEnter_SearchForInput(prop.getProperty("validReportID"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.availability_of_reportID(), true);
		DRP.switchBackFromIframe();
	}
	@Test(priority=41)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_selectionBox_enter_invalidReportID_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_idOption();
		DRP.toEnter_SearchForInput(prop.getProperty("invalidReportID"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.alertMessage(), true);
		DRP.switchBackFromIframe();
	}
	@Test(priority=42)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_andEnter_ReportName_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_idOption();
		DRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.alertMessage(), true);
		DRP.switchBackFromIframe();
	}	
	@Test(priority=43)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_selectionBox_enter_invalidReportName_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_idOption();
		DRP.toEnter_SearchForInput(prop.getProperty("invalidReportName"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.alertMessage(), true);
		DRP.switchBackFromIframe();
	}	
	@Test(priority=44)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_selectionBox_enter_validReportID_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_nameOption();
		DRP.toEnter_SearchForInput(prop.getProperty("validReportID"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.alertMessage(), true);
		DRP.switchBackFromIframe();	
	}	
	@Test(priority=45)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_selectionBox_enter_invalidReportID_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_nameOption();
		DRP.toEnter_SearchForInput(prop.getProperty("invalidReportID"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.alertMessage(), true);
		DRP.switchBackFromIframe();
	}	
	@Test(priority=46)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_andEnter_validReportName_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_nameOption();
		DRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.availability_of_reportName(), true);
		DRP.switchBackFromIframe();	
	}
	@Test(priority=47)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_andEnter_invalidReportName_in_SearchFor_inputField() {
		DRP.switchToIframe();
		DRP.toClick_ResetButton();
		DRP.toSelect_nameOption();
		DRP.toEnter_SearchForInput(prop.getProperty("invalidReportName"));
		DRP.toClick_SearchButton();
		AssertJUnit.assertEquals(DRP.alertMessage(), true);
		DRP.switchBackFromIframe();	
	}	
	@Test(priority=48)
	public void validate_functionality_of_Reset_button() {
		DRP.switchToIframe();
		DRP.toSelect_nameOption();
		DRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		DRP.toClick_ResetButton();	
		DRP.switchBackFromIframe();
	}
		@Test(priority=49)
	public void validate_functionality_of_ReportID_link_by_clickOn_ReportID() {
		RP.to_click_defineReport();
		DRP.switchToIframe();
		DRP.toClick_ReportIDLink();
		AssertJUnit.assertEquals(DRP.availability_of_backButton(), true);
		DRP.switchBackFromIframe();		
	}	
	@Test(priority=50)
	public void validate_functionality_of_Back_button() {
		RP.to_click_defineReport();
		DRP.switchToIframe();
		DRP.toClick_ReportIDLink();
		DRP.toClick_BackButton();
		AssertJUnit.assertEquals(DRP.defineReport_page(), true);
		DRP.switchBackFromIframe();			
	}
}
