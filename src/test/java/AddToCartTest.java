import org.example.AssertionMessages;
import org.example.CategoryPage;
import org.example.MyAccountPage;
import org.example.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public class AddToCartTest extends BaseTest
{
    @Test
    public void TestingCartFunctionality() throws InterruptedException {
        CategoryPage categoryPage = homePage.clickCategoryButton();
        categoryPage.click_on_croissants_option();
        ProductPage productPage = categoryPage.click_on_croissants_1_button();
        productPage.click_on_product_page_increase();
        productPage.click_on_add_to_cart_button();

        Assert.assertTrue(
                isElementPresent(getDriver(), By.xpath("//a[contains(text(),'Ցուցադրել')]")),
                AssertionMessages.ELEMENT_WITH_TEXT_NOT_DISPLAYED
        );
    }

    // In BaseTest or directly in the AddToCartTest class
    public boolean isElementPresent(WebDriver driver, By locator) {
        try {
            // Just checking for presence, not visibility or clickability
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
