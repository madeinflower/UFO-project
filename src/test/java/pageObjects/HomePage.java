package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//button[@class =\"btn order-btn\" and contains(text(),\"Order Now\")]")
    public WebElement orderNowButton;

    @FindBy(xpath = "//button[@class =\"btn order-btn\" and contains(text(),\"Close\")]")
    public WebElement closeButtonModal;

    @FindBy(xpath = "//button[@class =\"btn order-btn\" and contains(text(),\"Add to cart\")]")
    public WebElement addToCartButtonModal;

    @FindBy(xpath = "//div[@class=\"modal-body\"]//img[@src=\"img/Todayspecialimg.png\"]")
    public WebElement imageModal;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
