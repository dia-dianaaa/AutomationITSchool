package Tests;

import Pages.CommonPage;
import Pages.Homepage;
import Pages.WebTablePage;
import SharedData.ShareDataDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebTableTest extends ShareDataDriver {

    @Test
    public void metodaTest() throws InterruptedException {

//        ChromeOptions options = new ChromeOptions();
//
//        options.addArguments(
//                "--user-data-dir=C:\\SeleniumChromeProfile"
//        );
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/");

        String firstName = "Diana";
        String lastName = "Mandache";
        String age = "25";
        String email = "test@test.ro";
        String salary = "10000";
        String department = "IT";


        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(2000);
        //   WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
        // elementsButton.click();

        Homepage homePage = new Homepage(getDriver());
        homePage.clickElements();

// //*[text()='Web Tables']
        // //*[@class='btn btn-light ' and contains (@id, 'item-3')]
        // //*[@class='element-list accordion-collapse collapse show']//*[@id = 'item-3']
        // //*[@class='element-list accordion-collapse collapse show']//li[@id = 'item-3']
        // (//li[@id = 'item-3'])[1] - sa ti-l ia pe primul element - cea mai scurta
        // //*[@class='element-list accordion-collapse collapse show']//[@class='menu-list']//li[@id='item-3'] - cea mai buna varianta
        // //*[@class='element-list accordion-collapse collapse show']//[@class='menu-list']//*[@class='btn btn-light ' and contains(@id, 'item-3')]
        js.executeScript("window.scrollBy(0, -400)");
        // WebElement webTableButton = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        // webTableButton.click();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Web Tables");

        Thread.sleep(2000);
        //   WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        //   addButton.click();

        //   WebElement firstNameField = driver.findElement(By.id("firstName"));
        //   firstNameField.sendKeys(firstName);

        //   WebElement lastNameField = driver.findElement(By.id("lastName"));
        //   lastNameField.sendKeys(lastName);

        //   WebElement emailField = driver.findElement(By.id("userEmail"));
        //    emailField.sendKeys(email);

        //   WebElement ageField = driver.findElement(By.id("age"));
        //   ageField.sendKeys(age);

        //   WebElement salaryField = driver.findElement(By.id("salary"));
        //   salaryField.sendKeys(salary);

        //   WebElement departmentField = driver.findElement(By.id("department"));
        //   departmentField.sendKeys(department);

        //   WebElement submitButton = driver.findElement(By.id("submit"));
        //  submitButton.click();

        WebTablePage webTablesPage = new WebTablePage(getDriver());
//        webTablesPage.clickOnAddButton();
//        webTablesPage.enterFirstName(firstName);
//        webTablesPage.enterLastName(lastName);
//        webTablesPage.enterUserEmail(email);
//        webTablesPage.enterAge(age);
//        webTablesPage.enterSalary(salary);
//        webTablesPage.enterDepartment(department);
//        webTablesPage.clickOnSubmitButton();

        webTablesPage.addEntry(firstName, lastName, email, age, salary, department);
        webTablesPage.addEntry("Diana", "Mandache", "test@test.ro", "25", "10000", "IT");

        WebElement rowAdded = getDriver().findElement(By.xpath("(//tr)[5]"));
        String rowAddedtext = rowAdded.getText();
        System.out.println(rowAddedtext);

           /* Assert.assertTrue(rowAddedtext.contains("Diana"));
            Assert.assertTrue(rowAddedtext.contains("Mandache"));
            Assert.assertTrue(rowAddedtext.contains("25"));
            Assert.assertTrue(rowAddedtext.contains("test@test.ro"));
            Assert.assertTrue(rowAddedtext.contains("10000"));
            Assert.assertTrue(rowAddedtext.contains("IT")); */

//        WebElement firstNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[1]"));
//        WebElement lastNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[2]"));
//        WebElement ageColumn = driver.findElement(By.xpath("(//tr)[5]//td[3]"));
//        WebElement emailColumn = driver.findElement(By.xpath("(//tr)[5]//td[4]"));
//        WebElement salaryColumn = driver.findElement(By.xpath("(//tr)[5]//td[5]"));
//        WebElement departmentColumn = driver.findElement(By.xpath("(//tr)[5]//td[6]"));
//
//        String firstNameColumnText = firstNameColumn.getText();
//        String lastNameColumnText = lastNameColumn.getText();
//        String ageColumnText = ageColumn.getText();
//        String emailColumnText = emailColumn.getText();
//        String salaryColumnText = salaryColumn.getText();
//        String departmentColumnText = departmentColumn.getText();

//        Assert.assertTrue(firstNameColumnText.equals(firstName));
//        Assert.assertTrue(lastNameColumnText.equals(lastName));
//        Assert.assertTrue(ageColumnText.equals(age));
//        Assert.assertTrue(emailColumnText.equals(email),"Email-ul nu a fost corect");
//        Assert.assertEquals(salaryColumnText, salary);
//
//
//        Assert.assertTrue(departmentColumn.getText().equals(department));
//        Assert.assertEquals(departmentColumn.getText(), department);

        // (//*[@class='rt-tr-group'][4])

        webTablesPage.verifyEntry(firstName, lastName, email, age, salary, department);
    }
}
