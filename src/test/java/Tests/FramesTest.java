package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class FramesTest {


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
        elementsList.get(2).click();

        WebElement iframeElement1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframeElement1);
        WebElement iframeText1 = driver.findElement(By.id("sampleHeading"));
        //  iframeText1.getText();
        System.out.println("Textul din primul iframe este " + iframeText1.getText());
        // String iframeTextReceived = iframeText1.getText();

        driver.switchTo().defaultContent();

        WebElement iframeElement2 = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(iframeElement2);
        WebElement iframeText2 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din al doilea iframe este " + iframeText2.getText());

        driver.switchTo().defaultContent();


    }

}
