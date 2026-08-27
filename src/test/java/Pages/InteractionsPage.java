package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.InteractionsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionsPage {

    WebDriver driver;
    InteractionsMethods interactionsMethods;
    @FindBy(xpath = "//div[@data-handler-id = 'T0']")
    WebElement oneElement;
    @FindBy(xpath = "//div[@data-handler-id = 'T8']")
    WebElement fiveElement;

    public InteractionsPage(WebDriver driver) {
        this.driver = driver;
        this.interactionsMethods = new InteractionsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void dragFirstElemToFifth() {
        interactionsMethods.dragAndDrop(oneElement, fiveElement, 0, 15);
    }
}
