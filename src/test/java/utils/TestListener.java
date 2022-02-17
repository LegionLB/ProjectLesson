package utils;

import Pages.base.BasePage;
import Settings.DriverSettings;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
        saveScreenshotPNG(DriverSettings.getDriver());
        saveTextLog(result.getMethod().getConstructorOrMethod().getName());
    }


    //Picture attachment for allure
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    //Text attachment for allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog (String message){
        return message;
    }
}
