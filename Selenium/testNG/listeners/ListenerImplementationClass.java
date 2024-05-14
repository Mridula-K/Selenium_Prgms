package listeners;

import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementationClass implements ITestListener,ISuiteListener
{

	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test Script Failed",true);
	}

}
