package Pages;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebTablePage {

    WebDriver driver;
    ElementsMethods elementsMethods;
    @FindBy(id = "addNewRecordButton")
    WebElement addButton;
    @FindBy(id = "firstName")
    WebElement firstNameField;
    @FindBy(id = "lastName")
    WebElement lastNameField;
    @FindBy(id = "userEmail")
    WebElement userEmailField;
    @FindBy(id = "age")
    WebElement ageField;
    @FindBy(id = "salary")
    WebElement salaryField;
    @FindBy(id = "department")
    WebElement departmentField;
    @FindBy(id = "submit")
    WebElement submitButton;
    @FindBy(xpath = "(//tr)[5]//td[1]")
    WebElement firstNameColumn;
    @FindBy(xpath = "(//tr)[5]//td[2]")
    WebElement lastNameColumn;
    @FindBy(xpath = "(//tr)[5]//td[3]")
    WebElement ageColumn;
    @FindBy(xpath = "(//tr)[5]//td[4]")
    WebElement emailColumn;
    @FindBy(xpath = "(//tr)[5]//td[5]")
    WebElement salaryColumn;
    @FindBy(xpath = "(//tr)[5]//td[6]")
    WebElement departmentColumn;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void addEntry(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        clickOnAddButton();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterUserEmail(userEmail);
        enterAge(age);
        enterSalary(salary);
        enterDepartment(department);
        clickOnSubmitButton();
    }

    public void clickOnAddButton() {
        elementsMethods.clickOnElement(addButton);
    }

    public void enterFirstName(String firstNameText) {

        elementsMethods.enterText(firstNameField, firstNameText);
    }

    public void enterLastName(String lastNameText) {

        elementsMethods.enterText(lastNameField, lastNameText);
    }

    public void enterUserEmail(String userEmailText) {

        elementsMethods.enterText(userEmailField, userEmailText);
    }

    public void enterAge(String ageText) {

        elementsMethods.enterText(ageField, ageText);
    }

    public void enterSalary(String salaryText) {

        elementsMethods.enterText(salaryField, salaryText);
    }

    public void enterDepartment(String departmentText) {

        elementsMethods.enterText(departmentField, departmentText);
    }

    public void clickOnSubmitButton() {

        elementsMethods.clickOnElement(submitButton);
    }

    public void verifyEntry(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        Assert.assertTrue(firstNameColumn.getText().equals(firstName));
        Assert.assertTrue(lastNameColumn.getText().equals(lastName));
        Assert.assertTrue(ageColumn.getText().equals(age));
        Assert.assertTrue(emailColumn.getText().equals(userEmail), "Email-ul nu a fost corect");
        Assert.assertEquals(salaryColumn.getText(), salary);
        Assert.assertTrue(departmentColumn.getText().equals(department));
        Assert.assertEquals(departmentColumn.getText(), department);
    }

}

