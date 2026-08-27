package Tests;

import Pages.CommonPage;
import Pages.Homepage;
import SharedData.ShareDataDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowTest2 extends ShareDataDriver {

    @Test
    public void metodaTest() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 400)");

        Homepage homePage = new Homepage(getDriver());
        homePage.clickAlerts();

        js.executeScript("window.scrollBy(0, -400)");

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Browser Windows");

        WebElement tabButton = getDriver().findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabList.get(1));
        WebElement newTabText = getDriver().findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul tab este " + newTabText.getText());

        getDriver().close();

        getDriver().switchTo().window(tabList.getFirst());

        WebElement windowButton = getDriver().findElement(By.id("windowButton"));
        windowButton.click();

        List<String> windowList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windowList.get(1));

        WebElement newWindowText = getDriver().findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul window este " + newWindowText.getText());

        getDriver().manage().window().maximize();

        getDriver().close();

    }

}
