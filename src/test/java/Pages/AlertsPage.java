package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {

    WebDriver driver;
    ElementsMethods elementsMethods;
    AlertMethods alertMethods;
    @FindBy(id = "alertButton")
    WebElement alertButton;
    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;
    @FindBy(id = "confirmButton")
    WebElement confirmButton;
    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.alertMethods = new AlertMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void dealWithAlertOk() {
        elementsMethods.clickOnElement(alertButton);
        alertMethods.alertOk();
    }

    public void dealWithAlertDelay(int seconds) {
        elementsMethods.clickOnElement(timerAlertButton);
        alertMethods.alertWithDelay(seconds);
    }

    public void dealWithAlertConfirm() {
        elementsMethods.clickOnElement(confirmButton);
        alertMethods.alertConfirm();
    }

    public void dealWithAlertCancel() {
        elementsMethods.clickOnElement(confirmButton);
        alertMethods.alertCancel();
    }

    public void dealWithAlertPromt(String value) {
        elementsMethods.clickOnElement(promtButton);
        alertMethods.alertText(value);
    }

}
