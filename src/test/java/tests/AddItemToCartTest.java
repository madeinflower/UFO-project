package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;

public class AddItemToCartTest {
    private static WebDriver driver;
    private static HomePage homePage;

    @BeforeAll
    public static void globalSetup() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://ufo.telran-edu.de:8888/home.html");
    }

    @Test
    public void orderNowButtonValidTest() {
        homePage.orderNowButton.click();
        homePage.addToCartButtonModal.isDisplayed();
        homePage.closeButtonModal.isDisplayed();
        homePage.imageModal.isDisplayed();
    }
}
