package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

    WebDriver driver;
    FramesMethods framesMethods;
    @FindBy(id = "frame1")
    WebElement frame1Element;
    @FindBy(id = "frame2")
    WebElement frame2Element;
    @FindBy(id = "sampleHeading")
    WebElement frameText;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        this.framesMethods = new FramesMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public String getFrame1Text() {
        return framesMethods.getTextFromFrame(frame1Element, frameText);
    }

    public String getFrame2Text() {
        return framesMethods.getTextFromFrame(frame2Element, frameText);
    }


}






