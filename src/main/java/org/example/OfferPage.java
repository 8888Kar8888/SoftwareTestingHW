package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OfferPage {
    private final WebDriver driver;
    private WebDriverWait wait;

    public OfferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void OrderingCake() {
        selectQuantityOfMembers();
        selectCakeOptions();
        enterColor("#E40707");
        enterName("Vaxtag");
        enterPhone("+37441758467");
        enterNote("Please Complete My Offer as soon as possible");
        submitOffer();
    }

    public void selectQuantityOfMembers() {
        clickElement(Locators.QUANTITY_OF_MEMBERS_BUTTON);
        clickElement(Locators.PERSONS_QUANTITY_30to35_OPTION);
    }

    public void selectCakeOptions() {
        clickElement(Locators.THREE_FLOOR_CAKE_OPTION);
        clickElement(Locators.CHOCOLATE_OPTION_BISQUIT);
        clickElement(Locators.CHOCOLATE_OPTION_CREME);
        clickElement(Locators.CAKE_NUCLEUS);
    }

    public void enterColor(String colorCode) {
        WebElement colorField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CAKE_COLOR_FIELD));
        colorField.clear();
        colorField.sendKeys(colorCode);
    }

    public void enterName(String name) {
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SPECIAL_OFFER_NAME_FIELD));
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void enterPhone(String phone) {
        WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SPECIAL_OFFER_PHONE_FIELD));
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void enterNote(String note) {
        WebElement noteField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SPECIAL_OFFER_NOTE_FIELD));
        noteField.clear();
        noteField.sendKeys(note);
    }

    public void submitOffer() {
        clickElement(Locators.SPECIAL_OFFER_SUBMIT_BUTTON);
    }

    public void clickElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SUCCESS_MESSAGE));
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false; // Success message not found or not visible
        }
    }

    public String getSuccessMessageText() {
        try {
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SUCCESS_MESSAGE));
            return successMessage.getText().trim();
        } catch (Exception e) {
            return ""; // Success message not found or not visible
        }
    }
    public HomePage click_Logo_MarushButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]"))).click();
        return new HomePage(driver);
    }

    public void click_second_floor_cake_button()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.OFFER_PAGE_CAKE_2_FLOOR)).click();
    }

    public WebElement getPhoneErrorField() {
        return driver.findElement(Locators.PHONE_ERROR_FIELD);
    }

    public WebElement getEmailErrorField()
    {
        return driver.findElement(Locators.EMAIL_ERROR_FIELD);
    }
}
