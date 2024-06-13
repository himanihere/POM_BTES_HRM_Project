package test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ReportPage;
import testBase.TestBase;
public class ReportTest  extends TestBase{
	LoginPage LP;
	ReportPage RP;
	public ReportTest() {
		super();
		
	}	
	@BeforeClass
	public void setup() throws IOException
	{
		//initialize();
		//LP= new LoginPage(driver);
		RP= new ReportPage(driver);
		//LP.login(prop.getProperty("user1"),prop.getProperty("pass1"));
	}
	@Test(priority=10)
	public void ReportField_visiblity_TestCase() {
		RP.availability_of_reportField();
		AssertJUnit.assertEquals(RP.check_reportField(), true);
    }
	
	@Test(priority=11)
    public void Redirect_cursor_to_ReportField() {
	    RP.redirect_cursor_toReportField();
	    AssertJUnit.assertEquals(RP.visibility_of_ViewReport(), true);
    }
	
    @Test(priority=12)
	public void Click_on_ReportField() {
    	RP.click_reportField();
    	RP.switchToIframe();
    	AssertJUnit.assertEquals(RP.viewReport_page(), true);
    	RP.switchBackFromIframe();
	}
    
    @Test(priority=13)
	 public void dropdownBox_clickOn_viewReports_option(){
    	RP.to_click_viewReport();
    	RP.switchToIframe();
    	AssertJUnit.assertEquals(RP.viewReport_page(), true);
    	RP.switchBackFromIframe();
	 }
    
    @Test(priority=14)
    public void DropdownBox_click_on_DefineReports_option() {
    	RP.to_click_defineReport();
    	RP.switchToIframe();
    	AssertJUnit.assertEquals(RP.defineReport_page(), true);
    	RP.switchBackFromIframe();
    }
   
}
