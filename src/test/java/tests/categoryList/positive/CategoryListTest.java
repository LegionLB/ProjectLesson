package tests.categoryList.positive;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.Catalog.*;

@Feature("Category Buttons")
public class CategoryListTest extends BaseTest {

    @Test(priority = 1, description = "Check the number of buttons in Catalog")
    @Attachment
    public void checkTheNumberOfCatalogButtons(){
        touchHomePage.countTheNumberOfButtonsInCatalog();
    }

    @Test(priority = 2,description = "Redirecting to the Catalog Page")
    @Attachment
    public void checkRedirectingToCatalogPage(){
        touchHomePage.goToCatalogPage();
        basePage.checkCurrentUrl(TOUCH_CATALOG_PAGE);
    }

    @Test(priority = 3, description = "Redirection to the Apple Product Page")
    @Attachment
    public void checkRedirectingToAppleProductPage(){
        touchHomePage.goToApplePage();
        basePage.checkCurrentUrl(TOUCH_APPLE_HOME_PAGE);
    }

    @Test(priority = 4, description = "Redirecting to the Xiaomi Product Page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the Xiaomi Product Page via " +
            "button 'Техника Xiaomi' in Category list on home page")
    public void checkRedirectingToXiaomiProductPage(){
        touchHomePage.goToXiaomiPage();
        basePage.checkCurrentUrl(TOUCH_XIAOMI_HOME_PAGE);
    }
}
