import org.example.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import java.time.Duration;


@Listeners(ScreenshotListener.class)
public class Case1 extends BaseTest
{
    @Test
    public void Cassse() throws InterruptedException {
        homePage.clickAccountButton();
        homePage.enterUsername("djnjdnf");
        homePage.enterPassword("sdjnvdjnvdj");
        MyAccountPage myAccountPage = homePage.clickLoginButton();
        myAccountPage.Switch_from_Login_to_Register();
        myAccountPage.FillRegistrations_EmailField("djnjdnf@gmail.com");
        myAccountPage.FillRegistrations_PasswordField("sdjnvdjnvddfbdhbfhdbj");
        myAccountPage.clickRegisterButton();
        myAccountPage.click_Logo_MarushButton();
        homePage.click_ORGANIC_MASCARA_2();
        OfferPage offerPage = homePage.clickOfferButton();
        offerPage.enterName("hdbhdb");
        offerPage.enterPhone("37677473647");
        offerPage.submitOffer();
        offerPage.click_Logo_MarushButton();
        CategoryPage categoryPage = homePage.clickCategoryButton();
        categoryPage.click_on_pastry_option();
        ProductPage productPage = categoryPage.click_on_pastry_2_button();
        productPage.click_on_product_page_increase();
        productPage.click_on_product_page_increase();
        productPage.click_on_product_page_decrease();
        productPage.click_on_add_to_cart_button();
        //productPage.click_on_cart_logo_button();

        Assert.assertTrue(
                isElementDisplayed(getDriver(),Locators.ADDED_EL_LOCATION),
                AssertionMessages.ELEMENT_WITH_TEXT_NOT_DISPLAYED
        );

        //offerPage.OrderingCake();
        //button[contains(text(),'Register')]
    }

    // In BaseTest or directly in the Case1 class
    public boolean isElementDisplayed(WebDriver driver, By locator) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator))
                    .isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

}

