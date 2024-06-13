package test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ReportPage;
import pages.ViewReportPage;
import testBase.TestBase;
public class ViewReportTest  extends TestBase{
	//LoginPage LP;
	ReportPage RP;
	ViewReportPage VRP;
	public ViewReportTest() {
		super();	
	}
	@BeforeClass
	public void setup() throws IOException
	{
		//initialize();
		//LP= new LoginPage(driver);
		RP= new ReportPage(driver);
		//LP.login(prop.getProperty("user1"),prop.getProperty("pass1"));
	    RP.to_click_viewReport();
		VRP= new ViewReportPage(driver); 
	}
	@Test(priority=15)
    public void Functionality_of_SearchBy_field_by_clicking_on_selectBox() {
		//switch to iframe
		VRP.switchToIframe();
		VRP.clickOn_SearchBy_selectBox();
		AssertJUnit.assertEquals(VRP.id_optionAvailability(), true);
		VRP.switchBackFromIframe();
    }
	
	@Test(priority=16)
	public void Validate_functionality_of_SearchButton_without_input(){
		VRP.switchToIframe();
		VRP.toClick_SearchButton();
		VRP.switchBackFromIframe();
	}	
	@Test(priority=17)
	public void Validate_default_input_for_SelectBox() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		AssertJUnit.assertEquals(VRP.select_optionAvailability(), true);
		VRP.switchBackFromIframe();
	}	
	@Test(priority=18)
	public void validate_functionality_of_SearchForField_when_clickOn_SearchFor_text() {
		VRP.switchToIframe();
		VRP.toselect_SearchForText();
		AssertJUnit.assertEquals(VRP.searchFor_inputBox_availability(), true);
		VRP.switchBackFromIframe();
	}	
	@Test(priority=19)
	public void validate_the_functionality_of_SearchFor_field_when_clickOn_inputBox() {
		VRP.switchToIframe();
		VRP.toselect_SearchForInputBox();
		AssertJUnit.assertEquals(VRP.searchFor_inputBox_availability(), true);
		VRP.switchBackFromIframe();
	}	
	@Test(priority=20)
	public void validate_functionality_of_SearchButton_without_searchByFieldSelection_andEntervalReportID_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toEnter_SearchForInput(prop.getProperty("validReportID"));
		VRP.toClick_SearchButton();
		VRP.switchBackFromIframe();
	}	
	@Test(priority=21)
	public void validate_functionality_Search_button_without_SearchByField_selection_and_entervalReportName_in_SearchFor_inputField(){
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		VRP.toClick_SearchButton();
		VRP.switchBackFromIframe();
	}
	@Test(priority=22)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_andEnter_ReportID_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_idOption();
		VRP.toEnter_SearchForInput(prop.getProperty("validReportID"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.availability_of_reportID(), true);
		VRP.switchBackFromIframe();
	}
	@Test(priority=23)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_selectionBox_enter_invalidReportID_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_idOption();
		VRP.toEnter_SearchForInput(prop.getProperty("invalidReportID"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.alertMessage(), true);
		VRP.switchBackFromIframe();
	}
	@Test(priority=24)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_andEnter_ReportName_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_idOption();
		VRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.alertMessage(), true);
		VRP.switchBackFromIframe();
	}
	@Test(priority=25)
	public void validate_functionalityOf_SearchButton_with_ID_optionSelectOn_SearchBy_selectionBox_enter_invalidReportName_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_idOption();
		VRP.toEnter_SearchForInput(prop.getProperty("invalidReportName"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.alertMessage(), true);
		VRP.switchBackFromIframe();
	}
	@Test(priority=26)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_selectionBox_enter_validReportID_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_nameOption();
		VRP.toEnter_SearchForInput(prop.getProperty("validReportID"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.alertMessage(), true);
		VRP.switchBackFromIframe();	
	}
	@Test(priority=27)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_selectionBox_enter_invalidReportID_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_nameOption();
		VRP.toEnter_SearchForInput(prop.getProperty("invalidReportID"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.alertMessage(), true);
		VRP.switchBackFromIframe();
	}	
	@Test(priority=28)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_andEnter_validReportName_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_nameOption();
		VRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.availability_of_reportName(), true);
		VRP.switchBackFromIframe();	
	}
	@Test(priority=29)
	public void validate_functionalityOf_SearchButton_with_Name_optionSelectOn_SearchBy_andEnter_invalidReportName_in_SearchFor_inputField() {
		VRP.switchToIframe();
		VRP.toClick_ResetButton();
		VRP.toSelect_nameOption();
		VRP.toEnter_SearchForInput(prop.getProperty("invalidReportName"));
		VRP.toClick_SearchButton();
		AssertJUnit.assertEquals(VRP.alertMessage(), true);
		VRP.switchBackFromIframe();	
	}
	@Test(priority=30)
	public void validate_functionality_of_Reset_button() {
		VRP.switchToIframe();
		VRP.toSelect_nameOption();
		VRP.toEnter_SearchForInput(prop.getProperty("validReportName"));
		VRP.toClick_ResetButton();	
		VRP.switchBackFromIframe();
	}	
	@Test(priority=31)
	public void validate_functionality_of_ReportID_link_by_clickOn_ReportID() {
		RP.to_click_viewReport();
		VRP.switchToIframe();
		VRP.toClick_ReportIDLink();
		AssertJUnit.assertEquals(VRP.availability_of_backButton(), true);
		VRP.switchBackFromIframe();		
	}	
	@Test(priority=32)
	public void validate_functionality_of_Back_button() {
		RP.to_click_viewReport();
		VRP.switchToIframe();
		VRP.toClick_ReportIDLink();
		VRP.toClick_BackButton();
		AssertJUnit.assertEquals(VRP.viewReport_page(), true);
		VRP.switchBackFromIframe();			
	}
 
}
