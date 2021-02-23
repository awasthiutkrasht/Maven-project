package Maven_Acti_Time_Element.Maven_Acti_Time_Element;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListeners extends BaseTest implements ITestListener  {

	@Override
	public void onFinish(ITestContext Context) {
		Reporter.log(Context.getName()+"Ends", true);
		
	}

	@Override
	public void onStart(ITestContext Context) {
		Reporter.log(Context.getName()+"start", true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	   Reporter.log(result.getName()+"failed", true);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		TakesScreenshot ts = (TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("C:\\Users\\utkrasht awasthi\\eclipse-workspace\\Acti_Time_Header_Element\\Screenshot");
         	try {
         		Files.copy(src, dest);
         	}catch(IOException e)
         	{
         		e.printStackTrace();
         	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"skipped", true);
		
	}

	@Override
	public void onTestStart(ITestResult result) {
	  Reporter.log(result.getName()+"method start", true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"method  passed", true);
		
	}
	
	

}
