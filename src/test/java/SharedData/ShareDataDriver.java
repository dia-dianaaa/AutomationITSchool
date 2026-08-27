package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ShareDataDriver {
    private WebDriver driver;

    @BeforeMethod
    public void initializeBrowser() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments(
                "--user-data-dir=C:\\SeleniumChromeProfile"
        );
        this.driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void clearBrowser() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
