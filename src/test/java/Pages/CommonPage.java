package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.ElementsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage {

    WebDriver driver;
    ElementsMethods elementsMethods;
    @FindBy(xpath = "//span[@class='text']")
    List<WebElement> elements;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnSubMenu(String text) {
        elementsMethods.selectElementFromListByText(elements, text);
    }
}
