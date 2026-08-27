package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesMethods {
    WebDriver driver;

    public FramesMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToFrame(WebElement frameElement) {
        driver.switchTo().frame(frameElement);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public String getTextFromFrame(WebElement frameElement, WebElement textElement) {
        switchToFrame(frameElement);
        String text = textElement.getText();
        switchToDefaultContent();
        return text;
    }

}
