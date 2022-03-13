package Pages.touchHomePage;

import Pages.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static Constants.Constant.Values.Catalog.NUMBER_OF_BUTTONS;

public class TouchHomePage extends BasePage {


    public TouchHomePage(WebDriver driver) {
        super(driver);
    }
    /**
     * Search
     */
    private final By searchField = By.xpath("//input[@name='q']");
    private final By searchButton = By.xpath("//input[@id='goSearch']");

    public TouchHomePage inputInSearchField(String whatToSearch){
        WebElement search = driver.findElement(searchField);
        waitElementIsVisible(search);
        scrollToElement(search);

        search.sendKeys(whatToSearch);

        return this;
    }

    public TouchHomePage clickOnSearchButton(){
        WebElement sButton = driver.findElement(searchButton);
        waitElementIsVisible(sButton);
        scrollToElement(sButton);

        sButton.click();

        return this;
    }


    /**
     * Search
     */

    /**
     * Catalog
     */
    // Category list
    private final By catalogButtons = By.xpath("//span[@class='tx']");
    private final By touchCatalogButton = By.xpath("//a[@class='heading orange mround']");
    private final By categoryAppleButton = By.xpath("//li[@class='eChild'][1]");
    private final By categoryXiaomiButton = By.xpath("(//li[@class='eChild'])[2]");

    @Step("Count the number of Buttons in the catalog")
    public TouchHomePage countTheNumberOfButtonsInCatalog(){

        List<WebElement> numberOfCatalogButtons = driver.findElements(catalogButtons);
        Assert.assertEquals(numberOfCatalogButtons.size(), NUMBER_OF_BUTTONS);

        return this;
    }

    @Step("Click on the 'Каталог товаров' button")
    public TouchHomePage goToCatalogPage(){

        WebElement catalogButton = driver.findElement(touchCatalogButton);
        waitElementIsVisible(catalogButton);
        scrollToElement(catalogButton);
        catalogButton.click();

        return this;
    }

    @Step("Click on the 'Техника Apple' button")
    public TouchHomePage goToApplePage(){

        WebElement appleButton = driver.findElement(categoryAppleButton);
        waitElementIsVisible(appleButton);
        scrollToElement(appleButton);
        appleButton.click();

        return this;
    }

    @Step("Click on the 'Техника Xiaomi' button")
    public TouchHomePage goToXiaomiPage(){

        WebElement xiaomiButton = driver.findElement(categoryXiaomiButton);
        waitElementIsVisible(xiaomiButton);
        scrollToElement(xiaomiButton);
        xiaomiButton.click();

        return this;
    }

    /**
     * Catalog
     */
}
