package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TextBoxTest {

    @Test
    public void metodaTest() throws InterruptedException {

        //String fullName = "Diana Mandache";
        //  String email = "test@test.ro";
        // String address = "Street test";
        //  String permanentaddress = "Street test 2";

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
        cardList.get(0).click();

        js.executeScript("window.scrollBy(0, -400)");
        Thread.sleep(2000);

        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.get(0).click();

        WebElement firstNameField = driver.findElement(By.id("userName"));
        firstNameField.sendKeys("Diana Mandache");

        WebElement lastNameField = driver.findElement(By.id("userEmail"));
        lastNameField.sendKeys("test@test.ro");

        WebElement emailField = driver.findElement(By.id("currentAddress"));
        emailField.sendKeys("Street test");

        WebElement ageField = driver.findElement(By.id("permanentAddress"));
        ageField.sendKeys("Street test 2");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement textBoxAdded = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']"));
        String textBoxAddedtext = textBoxAdded.getText();
        System.out.println(textBoxAddedtext);

        WebElement name = driver.findElement(By.id("name"));
        assert name.getText().equals("Name:Diana Mandache");

        WebElement email = driver.findElement(By.id("email"));
        assert email.getText().equals("Email:test@test.com");

        List<WebElement> infoList = driver.findElements(By.xpath("//*[@class='mb-1']"));
        assert infoList.get(2).getText().equals("Current Address :Street test");
        assert infoList.get(3).getText().equals("Permananet Address :Street test 2");

        // List<String> expectedValues = List.of(
        //       "Diana Mandache",
        //     "test@test.ro",
        //   "Street test",
        // "Street test 2"
        //);

        //for (String expected : expectedValues) {
        //  Assert.assertTrue(
        //        textBoxAddedtext.contains(expected),
        //      "Expected text to contain: '" + expected + "', but was: '" + textBoxAddedtext + "'"
        // );

        // List<WebElement> infoList = driver.findElements(By.xpath("//*[@class='mb-1']"));
        //  assert infoList.get(2).getText().equals("Current Address :testing unu doi trei");
        //  assert infoList.get(3).getText().equals("Permanent Address :testing unu doi trei cinspe asta este adresa permanenta");
    }


}


