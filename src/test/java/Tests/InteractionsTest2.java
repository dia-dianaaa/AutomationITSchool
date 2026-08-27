package Tests;

import Pages.CommonPage;
import Pages.Homepage;
import Pages.InteractionsPage;
import SharedData.ShareDataDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class InteractionsTest2 extends ShareDataDriver {

    @Test
    public void metodaTest() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 400)");

        Homepage homePage = new Homepage(getDriver());
        homePage.clickInteractions();

        js.executeScript("window.scrollBy(0, -400)");

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Sortable");

        InteractionsPage interactionsPage = new InteractionsPage(getDriver());

        interactionsPage.dragFirstElemToFifth();

    }
}
