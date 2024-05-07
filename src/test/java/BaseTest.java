import org.example.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        // Any additional browser-specific options can be set here

        // Assuming the Selenium Grid Hub is running on localhost at port 4444
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        driver.manage().window().maximize();
        driver.get("https://marush.am/");
        homePage = new HomePage(driver);
        ScreenshotListener.setDriver(driver);

    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
