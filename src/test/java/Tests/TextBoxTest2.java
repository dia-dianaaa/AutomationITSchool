package Tests;

import Pages.CommonPage;
import Pages.Homepage;
import Pages.TextBoxPage;
import Pages.WebTablePage;
import SharedData.ShareDataDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static java.sql.DriverManager.getDriver;

public class TextBoxTest2 extends ShareDataDriver {

    @Test
    public void metodaTest() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 600)");

        Homepage homePage = new Homepage(getDriver());
        homePage.clickElements();

        js.executeScript("window.scrollBy(0, -500)");

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Text Box");

        TextBoxPage textBoxPage = new TextBoxPage(getDriver());

        textBoxPage.addEntry("dianamandache", "test@test.ro", "test test Street", "test Street");

        List<WebElement> infoList = getDriver().findElements(By.xpath("//*[@class='mb-1']"));
        assert infoList.get(0).getText().equals("Name:dianamandache");
        assert infoList.get(1).getText().equals("Email:test@test.ro");
        assert infoList.get(2).getText().equals("Current Address :test test Street");
        assert infoList.get(3).getText().equals("Permananet Address :test Street");

    }


}


