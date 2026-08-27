package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InteractionsMethods {

    WebDriver driver;

    public InteractionsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop(WebElement sourceElement, WebElement targetElement, int xOffset, int yOffset) {
        Actions action = new Actions(driver);
        action.clickAndHold(sourceElement)
                .moveToElement(targetElement, xOffset, yOffset)
                .release()
                .build()
                .perform();
    }
}
