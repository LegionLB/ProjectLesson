package StepDefinition;

import Pages.base.BasePage;
import Pages.touchHomePage.TouchHomePage;
import Pages.touchListingPage.TouchListingPage;
import Settings.DriverSettings;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static Constants.Constant.Urls.Catalog.*;
import static Constants.Constant.Urls.Home.TOUCH_HOME_PAGE;

public class DefinitionSteps {

    protected WebDriver driver = DriverSettings.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected TouchHomePage touchHomePage = new TouchHomePage(driver);
    protected TouchListingPage touchListingPage = new TouchListingPage(driver);

    @Given("User opens Touch Home page")
    public void openPage(){
        basePage.open(TOUCH_HOME_PAGE);
    }

    @When("User searching a product by keyword {string}")
    public void userSearchingAProductByKeywordProduct(final String whatToSearch) {
        touchHomePage.inputInSearchField(whatToSearch);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        touchHomePage.clickOnSearchButton();
    }

    @Then("User can see amount of products with a {string}")
    public void userCanSeeAmountOfProductsWithAKeyword(final String whatToSearch) {
        touchListingPage.productCardSearchResultContain(whatToSearch);
    }

    @After
    public void closeBrowserCucumber(){
        driver.quit();
    }

    @When("User goes to catalog and click on Apple product")
    public void userGoesToCatalogAndClickOnProduct() {
        touchHomePage.goToApplePage();
    }

    @Then("User is redirected to Apple product page")
    public void userIsRedirectedToAppleProductPage() {
        basePage.checkCurrentUrl(TOUCH_APPLE_HOME_PAGE);
    }

    @When("User goes to catalog and click on Xiaomi product")
    public void userGoesToCatalogAndClickOnXiaomiProduct() {
        touchHomePage.goToXiaomiPage();
    }

    @Then("User is redirected to Xiaomi product page")
    public void userIsRedirectedToXiaomiProductPage() {
        basePage.checkCurrentUrl(TOUCH_XIAOMI_HOME_PAGE);
    }

    @When("User goes to catalog and click on Catalog button")
    public void userGoesToCatalogAndClickOnCatalogButton() {
        touchHomePage.goToCatalogPage();
    }

    @Then("User is redirected to Catalog page")
    public void userIsRedirectedToCatalogPage() {
        basePage.checkCurrentUrl(TOUCH_CATALOG_PAGE);
    }
}
