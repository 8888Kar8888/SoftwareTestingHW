import org.example.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import java.time.Duration;
import java.time.Instant;

@Listeners(ScreenshotListener.class)
public class Case2 extends BaseTest
{
    @Test
    public void Casssse2() throws InterruptedException
    {
        CategoryPage categoryPage = homePage.clickCategoryButton();
        categoryPage.click_on_bread_option();
        categoryPage.fill_search_field("akskaksa");
        Thread.sleep(2000);
        ProductPage productPage = categoryPage.third_bread_button();
        Thread.sleep(2000);
        productPage.product_wishlist_button();
        Thread.sleep(2000);
        HomePage homePage1 = productPage.maroosh_homebutton_click();
        homePage1.clickAccountButton();
        homePage1.enterUsername("dfjdjfhd");
        MyAccountPage myAccountPage = homePage1.clickLoginButton();
        HomePage homePage2 = myAccountPage.click_Logo_MarushButton();
        homePage2.click_ORGANIC_MASCARA_2();
        OfferPage offerPage = homePage2.clickOfferButton();
        offerPage.submitOffer();
        Thread.sleep(3000);

        WebElement messageElement1 = getDriver().findElement(Locators.EMAIL_ERROR_FIELD);
        String actualMessage1 = messageElement1.getText();
        Assert.assertEquals(actualMessage1, AssertionMessages.FIELD_IS_REQUIRED, "The expected message at location 1 is not correct.");

        // Check for the message at the second location
        WebElement messageElement2 = getDriver().findElement(Locators.PHONE_ERROR_FIELD);
        String actualMessage2 = messageElement2.getText();
        Assert.assertEquals(actualMessage2, AssertionMessages.FIELD_IS_REQUIRED, "The expected message at location 2 is not correct.");

//        homePage.click_ORGANIC_MASCARA_2();
//        OfferPage offerPage = homePage.clickOfferButton();
//        offerPage.click_second_floor_cake_button();
    }
}
