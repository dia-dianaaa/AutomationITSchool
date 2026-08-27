package Tests;

import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.Homepage;
import Pages.WebTablePage;
import SharedData.ShareDataDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AlertsTest extends ShareDataDriver {

    @Test
    public void metodaTest() throws InterruptedException {

//        ChromeOptions options = new ChromeOptions();
//
//        options.addArguments(
//                "--user-data-dir=C:\\SeleniumChromeProfile");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(2000);

//        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
//        cardList.get(2).click();

        Homepage homePage = new Homepage(getDriver());
        homePage.clickAlerts();

        js.executeScript("window.scrollBy(0, -200)");
        Thread.sleep(2000);

//        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
//        elementsList.get(1).click();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Alerts");

//        WebElement alertButton = driver.findElement(By.id("alertButton"));
//
//        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
//
//        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
//
//        WebElement promtButton = driver.findElement(By.id("promtButton"));


//        alertButton.click();
//        Alert alertOk = driver.switchTo().alert();
//        alertOk.accept();

        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.dealWithAlertOk();
        alertsPage.dealWithAlertDelay(5);
        alertsPage.dealWithAlertConfirm();
        // alertsPage.dealWithAlertCancel();
        alertsPage.dealWithAlertPromt("buna");

        //putem pune si un assert


//        timerAlertButton.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert5Seconds = driver.switchTo().alert();
//        alert5Seconds.accept();
//
//        wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
//        confirmButton.click();
//        Alert alertConfirm = driver.switchTo().alert();
//        alertConfirm.dismiss();
//
//        promtButton.click();
//        Alert alertPromt = driver.switchTo().alert();
//        alertPromt.sendKeys("ce vrei");
//        alertPromt.accept();
    }
}
