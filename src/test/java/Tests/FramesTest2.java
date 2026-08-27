package Tests;

import Pages.CommonPage;
import Pages.FramesPage;
import Pages.Homepage;
import SharedData.ShareDataDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class FramesTest2 extends ShareDataDriver {


    @Test
    public void metodaTest() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 400)");

        Homepage homePage = new Homepage(getDriver());
        homePage.clickAlerts();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Frames");

        FramesPage framesPage = new FramesPage(getDriver());

        String frame1Text = framesPage.getFrame1Text();
        String frame2Text = framesPage.getFrame2Text();

        System.out.println("Textul din primul iframe este " + frame1Text);
        System.out.println("Textul din al doilea iframe este " + frame2Text);

        assert frame1Text.equals("This is a sample page");
        assert frame2Text.equals("This is a sample page");

    }

}
