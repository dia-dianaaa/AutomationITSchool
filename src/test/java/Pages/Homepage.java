package Pages;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class Homepage {

    WebDriver driver;
    ElementsMethods elementsMethods;
    @FindBy(xpath = "//h5[text()='Elements']")
    WebElement elementsButton;
    @FindBy(xpath = "//h5[text()='Forms']")
    WebElement formsButton;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    WebElement alertsButton;
    @FindBy(xpath = "//h5[text()='Interactions']")
    WebElement interactionsButton;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickElements() {
        elementsMethods.clickOnElement(elementsButton);
    }

    public void clickAlerts() {
        elementsMethods.clickOnElement(alertsButton);
    }

    public void clickInteractions() {
        elementsMethods.clickOnElement(interactionsButton);
    }
}
