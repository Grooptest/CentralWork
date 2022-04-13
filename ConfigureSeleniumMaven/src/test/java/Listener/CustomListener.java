package Listener;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
        System.out.println("Test Start");
	}

	public void onTestSuccess(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test");
		failed(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext arg0) {

	}

	public void onFinish(ITestContext context) {
		
	}

	public void onStart(ISuite arg0) {

	}

	public void onFinish(ISuite context) {

	}
}
