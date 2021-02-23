package Maven_Acti_Time_Element.Maven_Acti_Time_Element;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseTest;
import com.actitime.genericlib.Filelib;
import com.actitime.pages.HomePageElement;
import com.actitime.pages.Userlist;
@Listeners(com.actitime.genericlib.MyListeners.class)
public class CreateNewCustomer extends BaseTest {
	@Test
	public void addUser() throws Throwable {
		ValidLoginTest vt = new ValidLoginTest();
		vt.login();
		
		HomePageElement hp = new HomePageElement(d);
		hp.clickUserTb();
		
		Userlist ul = new Userlist(d);
		ul.clickNewUser();
		Thread.sleep(2000);
		
		Filelib flib = new Filelib();
	     ul.create(flib.getCellValue(EXCEL_PATH, "Sheet1", 0, 1),
				    flib.getCellValue(EXCEL_PATH, "Sheet1", 1, 1), 
				    flib.getCellValue(EXCEL_PATH, "Sheet1", 2, 1),
				    flib.getCellValue(EXCEL_PATH, "Sheet1", 3, 1)); 
			
	
	}

}
