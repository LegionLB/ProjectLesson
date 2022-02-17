package Pages.base;

import io.qameta.allure.Step;
import net.bytebuddy.implementation.bytecode.ShiftRight;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Constants.Constant.Timeouts.EXPLICIT_WAIT;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }


    public void open(String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    // scrollToElement method needs to use after found element
    public void scrollToElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Step("Check current URL With Expected URL - {0}")
    public void checkCurrentUrl(String expectedUrl){


        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

    }

    public void checkCurrentTitle(String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    public void closePage(){
        driver.close();
    }

    //Browser button
    public void goBack(){
        driver.navigate().back();
    }

    //Browser button
    public void goForward(){
        driver.navigate().forward();
    }

    //Browser button
    public void refreshPage(){
        driver.navigate().refresh();
    }

}
