package Listerns;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("Logger: Test Start:"+ result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Logger: Test Success:"+ result.getName());
    }
    @Override public void onTestFailure(ITestResult result) {
        System.out.println("Logger: Test Failure:"+ result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Logger: Test Skipped:"+ result.getName());
    }

}
