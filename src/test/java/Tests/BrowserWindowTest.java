package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowTest {

    @Test
    public void metodaTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments(
                "--user-data-dir=C:\\SeleniumChromeProfile");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(2000);

        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(2).click();

        js.executeScript("window.scrollBy(0, -400)");
        Thread.sleep(2000);

        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.getFirst().click();

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        WebElement newTabText = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul tab este " + newTabText.getText());

        driver.close();

        driver.switchTo().window(tabList.getFirst());

        WebElement windowButton = driver.findElement(By.id("windowButton"));
        windowButton.click();

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));

        WebElement newWindowText = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul window este " + newWindowText.getText());

        driver.manage().window().maximize();

        driver.close();

    }

}
