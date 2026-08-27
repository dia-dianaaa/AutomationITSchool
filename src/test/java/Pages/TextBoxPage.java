package Pages;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TextBoxPage {

    WebDriver driver;
    ElementsMethods elementsMethods;
    @FindBy(id = "userName")
    WebElement userNameField;
    @FindBy(id = "userEmail")
    WebElement userEmailField;
    @FindBy(id = "currentAddress")
    WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    WebElement permanentAddressField;
    @FindBy(id = "submit")
    WebElement submitButton;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void addEntry(String userName, String userEmail, String currentAddress, String permanentAddress) {
        enterUserName(userName);
        enterUserEmail(userEmail);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);
        clickOnSubmitButton();
    }

    public void enterUserName(String userNameText) {
        elementsMethods.enterText(userNameField, userNameText);
    }

    public void enterUserEmail(String userEmailText) {
        elementsMethods.enterText(userEmailField, userEmailText);
    }

    public void enterCurrentAddress(String currentAddressText) {
        elementsMethods.enterText(currentAddressField, currentAddressText);
    }

    public void enterPermanentAddress(String permanentAddressText) {
        elementsMethods.enterText(permanentAddressField, permanentAddressText);
    }

    public void clickOnSubmitButton() {
        elementsMethods.clickOnElement(submitButton);
    }


}
