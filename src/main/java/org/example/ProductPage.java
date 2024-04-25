package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class ProductPage
{
    private final WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click_on_product_page_increase()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT_PAGE_INCREASE_QUANTITY_BUTTON)).click();
    }

    public void click_on_product_page_decrease()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT_PAGE_DECREASE_QUANTITY_BUTTON)).click();
    }

    public void click_on_add_to_cart_button() throws InterruptedException
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT_PAGE_ADD_TO_CART_BUTTON)).click();
        Thread.sleep(5000);


    }

    public void click_on_cart_logo_button()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT_PAGE_ADD_TO_CART_BUTTON)).click();
    }

    public void product_wishlist_button()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]"))).click();
//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]
    }

    public HomePage maroosh_homebutton_click()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PRODUCT_PAGE_MARUSH_HOME_BUTTON)).click();
        return new HomePage(driver);
    }
}
