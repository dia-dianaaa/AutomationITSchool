package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class ExempleWebsites {

    @Test
    public void metodaTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments(
                "--user-data-dir=C:\\SeleniumChromeProfile");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://automationexercise.com");

        List<WebElement> navigartionBar = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li"));
        navigartionBar.get(3).click();

    }
}
