package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoryPage
{
    private final WebDriver driver;
    WebDriverWait wait;

    public CategoryPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click_on_croissants_option()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CROISSANTS_OPTION_BUTTON)).click();
    }

    public void click_on_pastry_option()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CATEGORY_PAGE_PASTRY_BUTTON)).click();
    }



    public ProductPage click_on_croissants_1_button() {
        try {
            Thread.sleep(5000);
            WebElement croissantButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.CROISSANTS_1_BUTTON));
            System.out.println("Element is clickable.");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", croissantButton);
            System.out.println("Clicked on the croissants 1 button using JavaScript.");
            return new ProductPage(driver);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ProductPage click_on_pastry_2_button() {
        try {
            WebElement pastryButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.PASTRY_2_BUTTON));
            System.out.println("Pastry 2 button is clickable.");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pastryButton);
            System.out.println("Clicked on the pastry 2 button using JavaScript.");
            return new ProductPage(driver);
        } catch (Exception e) {
            System.out.println("Failed to click on the pastry 2 button: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public void click_on_bread_option()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CATEGORY_PAGE_BREAD_BUTTON)).click();
    }

    public void fill_search_field(String search)
    {
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CATEGORY_PAGE_SEARCH_FIELD));
        nameField.clear();
        nameField.sendKeys(search);
    }



    public ProductPage third_bread_button()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[1]/a[1]/img[1]"))).click();
        return new ProductPage(driver);
    }





}



