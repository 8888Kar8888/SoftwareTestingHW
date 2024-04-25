package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {
    private final WebDriver driver;
    WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void Switch_from_Login_to_Register()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.FROM_LOGIN_TO_REGISTER_BUTTON)).click();
    }


    public void FillRegistrations_EmailField(String email)
    {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.REGISTER_EMAIL_FIELD));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void FillRegistrations_PasswordField(String password)
    {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.REGISTER_PASSWORD_FIELD));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickRegisterButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.REGISTER_BUTTON)).click();
    }

    public String getLoginErrorMessageText() {
        try {
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOGIN_ERROR_MESSAGE));
            return errorMessage.getText().trim();
        } catch (Exception e) {
            return ""; // Error message not found or not visible
        }
    }

    public HomePage click_Logo_MarushButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.HOMEPAGE_LOGO_BUTTON)).click();
        return new HomePage(driver);
    }
}
