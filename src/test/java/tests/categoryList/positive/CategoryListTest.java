package tests.categoryList.positive;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.TOUCH_APPLE_HOME_PAGE;

public class CategoryListTest extends BaseTest {

    @Test
    public void checkRedirectingToAppleProductPage(){

        touchHomePage.goToApplePage();
        basePage.checkCurrentUrl(TOUCH_APPLE_HOME_PAGE);

    }

}
