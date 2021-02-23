package Maven_Acti_Time_Element.Maven_Acti_Time_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoCons {
	public static WebDriver d ;
	
	public void openBrowser() throws Throwable {
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	    d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    Filelib flib = new Filelib();
	    d.get(flib.getProperty(PROP_PATH, "url"));
	 }

   public void closeBrowser() {
	 d.quit();  
   }
}