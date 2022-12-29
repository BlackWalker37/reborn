package amazon;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Amazon {
    private final By ACCEPT_COOKIES_BTN = By.id("sp-cc-accept");
    private final By LIST_ANY_DEPARTMENT = By.id("CardInstanceddBV1H9rzk5kDM0deh1Syg");
    private final By ACCEPT_LOCATION = By.xpath(".//input[@data-action-type = \"DISMISS\"]");
    private final By BEST_SELLERS_BTN = By.xpath(".//a [@data-csa-c-content-id = 'nav_cs_bestsellers']");
    private final By BOOKS_BTN = By.xpath(".// a[@href = '/-/en/gp/bestsellers/books/ref=zg_bs_nav_0']");

    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void openHomePage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.amazon.de/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_LOCATION));
        browser.findElement(ACCEPT_LOCATION).click();

        wait.until(ExpectedConditions.elementToBeClickable(BEST_SELLERS_BTN));
        browser.findElement(BEST_SELLERS_BTN).click();

        wait.until(ExpectedConditions.elementToBeClickable(BOOKS_BTN));
        browser.findElement(BOOKS_BTN).click();


    }
}
