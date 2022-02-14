package Settings;

import org.openqa.selenium.WebDriver;

import Settings.Config;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Constants.Constant.Timeouts.IMPLICIT_WAIT;

public class DriverSettings {

    public static WebDriver createDriver(){

        WebDriver driver = null;

        // change Config.XXX to choose a system and browser(Check Config file)
        switch (Config.MAC_CHROME){

            case "mac_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "mac_firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("Incorrect system or platform!");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }

}
