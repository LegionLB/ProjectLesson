package Pages.touchHomePage;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TouchHomePage extends BasePage {


    public TouchHomePage(WebDriver driver) {
        super(driver);
    }

    // Category list
    private final By categoryAppleButton = By.xpath("//li[@class='eChild'][1]");
    private final By categoryXiaomiButton = By.xpath("(//li[@class='eChild'])[2]");

    public TouchHomePage goToApplePage(){

        WebElement appleButton = driver.findElement(categoryAppleButton);
        waitElementIsVisible(appleButton);
        scrollToElement(appleButton);
        appleButton.click();

        return this;
    }

    public TouchHomePage goToXiaomiPage(){

        WebElement xiaomiButton = driver.findElement(categoryXiaomiButton);
        waitElementIsVisible(xiaomiButton);
        scrollToElement(xiaomiButton);
        xiaomiButton.click();

        return this;
    }


}
