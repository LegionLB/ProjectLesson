package tests.base;

import Pages.base.BasePage;
import Pages.touchHomePage.TouchHomePage;
import Settings.DriverSettings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import static Constants.Constant.Urls.TOUCH_HOME_PAGE;
import static Settings.Config.CLEAR_COOKIES_AND_LOCAL_STORAGE;

public class BaseTest {

    protected WebDriver driver = DriverSettings.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected TouchHomePage touchHomePage = new TouchHomePage(driver);

    @BeforeTest
    public void openTouchHomePage(){
        basePage.open(TOUCH_HOME_PAGE);
    }


    @AfterClass
    public void clearCookiesAndLocalStorage(){
        if(CLEAR_COOKIES_AND_LOCAL_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
