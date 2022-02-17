package tests.categoryList.positive;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.TOUCH_APPLE_HOME_PAGE;
import static Constants.Constant.Urls.TOUCH_XIAOMI_HOME_PAGE;

@Feature("Category Buttons")
public class CategoryListTest extends BaseTest {

    @Test(description = "Redirection to the Apple Product Page")
    @Attachment
    public void checkRedirectingToAppleProductPage(){
        touchHomePage.goToApplePage();
        basePage.checkCurrentUrl(TOUCH_APPLE_HOME_PAGE);
    }

    @Test(description = "Redirecting to the Xiaomi Product Page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the Xiaomi Product Page via " +
            "button 'Техника Xiaomi' in Category list on home page")
    public void checkRedirectingToXiaomiProductPage(){
        touchHomePage.goToXiaomiPage();
        basePage.checkCurrentUrl(TOUCH_XIAOMI_HOME_PAGE);
    }
}
