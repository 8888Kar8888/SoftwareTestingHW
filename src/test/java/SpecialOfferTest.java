import org.example.OfferPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public class SpecialOfferTest extends BaseTest
{
    @Test
    public void TestingSpecialOffer() {
        homePage.click_ORGANIC_MASCARA_2();
        OfferPage offerPage = homePage.clickOfferButton();
        offerPage.OrderingCake();

        // Get the text of the success message
        String successMessage = offerPage.getSuccessMessageText();
        System.out.println("Success Message: " + successMessage);

        // Check if the success message is displayed
        Assert.assertTrue(!successMessage.isEmpty(), "Success message not displayed after submitting the special offer form.");
    }


}
