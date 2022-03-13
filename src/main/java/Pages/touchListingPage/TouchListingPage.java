package Pages.touchListingPage;

import Pages.base.BasePage;
import Pages.touchHomePage.TouchHomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TouchListingPage extends BasePage {
    public TouchListingPage(WebDriver driver) {
        super(driver);
    }

    private final By searchResultText = By.xpath("//h1[@class='changeName']");
    //private final By productCard = By.xpath("//div[contains(@class, 'item product sku')]");
    private final By productCard = By.xpath("//div[@class='item product sku cat_section']");

    @Step("Check that page's name contains - {0}")
    public TouchListingPage resultOfSearchText(String whatToSearch){
        WebElement resultText = driver.findElement(searchResultText);
        waitElementIsVisible(resultText);
        scrollToElement(resultText);

        Assert.assertEquals(resultText.getText(), "Результаты поиска - «" + whatToSearch + "»");

        return this;
    }

    @Step("Check that all product cards contains - {0}")
    public TouchListingPage productCardSearchResultContain(String whatToSearch){
        List<WebElement> productCardList = driver.findElements(productCard);

        for (WebElement element: productCardList){
            waitElementIsVisible(element);
            scrollToElement(element);

            Assert.assertTrue(element.getText().toLowerCase().contains(whatToSearch.toLowerCase()));
        }
        return this;
    }

}
