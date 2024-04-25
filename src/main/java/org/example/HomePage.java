package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Method to click on the Account button to open the login/register modal.
     */
    public void clickAccountButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ACCOUNT_BUTTON)).click();
    }

    public void enterUsername(String username) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.USERNAME_FIELD));
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PASSWORD_FIELD));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public MyAccountPage clickLoginButton() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.LOGIN_BUTTON));
        loginButton.click();
        return new MyAccountPage(driver);
    }

    public MyAccountPage click_RegisterButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CREATE_ACCOUNT_BUTTON)).click();
        return new MyAccountPage(driver);
    }

    public void click_ORGANIC_MASCARA_2()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ORGANIC_MASCARA_2)).click();
    }

    public OfferPage clickOfferButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SPECIAL_OFFER_BUTTON)).click();
        return new OfferPage(driver);
    }

    public CategoryPage clickCategoryButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CATEGORY_BUTTON)).click();
        return new CategoryPage(driver);
    }

        public void function() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("header/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/span[1]"))).click();
        }
}
