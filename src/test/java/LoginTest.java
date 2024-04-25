import org.example.AssertionMessages;
import org.example.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;


@Listeners(ScreenshotListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void TestingLogin() {
        // Click on the Account Button using the HomePage method
       // homePage.clickAccountButton();
         homePage.clickAccountButton();
        homePage.enterUsername("your_username");
        homePage.enterPassword("your_password");
        MyAccountPage loginPage = homePage.clickLoginButton();

        // Get the text of the error message
        String actualErrorMessage = loginPage.getLoginErrorMessageText();
        System.out.println("Error Message: " + actualErrorMessage);

        // Check if the error message contains the expected part
        Assert.assertTrue(actualErrorMessage.contains(AssertionMessages.ERROR_MESSAGE_LOGIN),
                AssertionMessages.LOGIN_ERROR_MESSAGE_NOT_CONTAINED + AssertionMessages.ERROR_MESSAGE_LOGIN);
    }
}




        // After clicking on the Account button, you may want to verify if the login modal is displayed.
        // This assumes you have a method in HomePage to check visibility of the login modal.
        // Example: Assert.assertTrue(homePage.isLoginModalVisible(), "Login modal is not visible.");

        // Since we don't have such a method yet, let's assume we're just checking something simple,
        // like if the URL has changed or if any specific element is now visible.
        // This is just a placeholder assertion to ensure the button leads to any expected change.


