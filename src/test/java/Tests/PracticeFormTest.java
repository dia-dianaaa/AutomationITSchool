package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PracticeFormTest {

    @Test
    public void metodaTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments(
                "--user-data-dir=C:\\Diana Mandache"
        );

        //ChromeOptions opt = new ChromeOptions();
        //opt.addExtensions(new File("src/Extensions/AdBlock.crx"));

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(2000);
        WebElement formsButton = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formsButton.click();

        WebElement practiceFormButton = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormButton.click();

        String gender = "Male";

        Thread.sleep(2000);

        WebElement maleGenderButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-1']"));

        WebElement femaleGenderButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-2']"));

        WebElement otherGenderButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-3']"));

        // if (gender.equals("Male")){

        // maleGenderButton.click();

        // } else if (gender.equals("Female")){

        //femaleGenderButton.click();
        // } else otherGenderButton.click();

        switch (gender) {

            case "Male":
                maleGenderButton.click();
                break;
            case "Female":
                femaleGenderButton.click();
                break;
            case "Other":
                otherGenderButton.click();
                break;
        }


        //*[@id='gender-radio-1']

    }
}
