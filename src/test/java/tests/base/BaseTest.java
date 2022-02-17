package tests.base;

import Pages.base.BasePage;
import Pages.touchHomePage.TouchHomePage;
import Settings.DriverSettings;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static Constants.Constant.Urls.TOUCH_HOME_PAGE;
import static Settings.Config.CLEAR_COOKIES_AND_LOCAL_STORAGE;

public class BaseTest {

    protected WebDriver driver = DriverSettings.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected TouchHomePage touchHomePage = new TouchHomePage(driver);

    @BeforeMethod
    @Step("Opening Touch Home Page")
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

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() { WebDriver webDriver = driver;
        return webDriver;
    }
}
