package tests.search.positive;

import io.cucumber.java.en.And;
import io.qameta.allure.Attachment;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchPositiveTest extends BaseTest {

    @Test(description = "Search items by using search field")
    @Attachment
    public void searchItem(){
        String whatToSearch = "MacBook";
        touchHomePage.inputInSearchField(whatToSearch);
        touchHomePage.clickOnSearchButton();
        touchListingPage.resultOfSearchText(whatToSearch);
        touchListingPage.productCardSearchResultContain(whatToSearch);
    }

}


