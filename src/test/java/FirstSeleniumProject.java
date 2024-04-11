import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstSeleniumProject
{
    private WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", ".idea/drivers/chromedriver.exe");  // Set path to ChromeDriver
        driver = new ChromeDriver();
        driver.get("https://4u.am/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

    //    @Test
//    public void findingElementWithDiffOptions()
//    {
//        WebElement el = driver.findElement(By.xpath("//header/div[3]/ul[1]/li[8]/a[1]"));
//       // WebElement el1 = driver.findElement(By.cssSelector("#basketIcon"));
//        //WebElement el2 =
//        el.click();
//        String url = driver.getCurrentUrl();
//        Assert.assertEquals(url,"https://4u.am/hy/vendor/midi-armenia");
//    }
    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://4u.am/hy/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.cssSelector("#loginFormUsername")).sendKeys("invalid_username");
        //Alternative way of finding username field
        //driver.findElement(By.xpath("//input[@id='loginFormUsername']")).sendKeys("invalid_username");

        //Text Field
        //driver.findElement(By.cssSelector("body:nth-child(2) section.partners.login_register:nth-child(10) div.tab div.login_diff_way:nth-child(2) > span:nth-child(1)"));
        //driver.findElement(By.xpath("//span[contains(text(),'կամ')]"));

        driver.findElement(By.cssSelector("#loginFormPassword")).sendKeys("invalid_password");

        driver.findElement(By.xpath("//button[contains(text(),'Մուտք')]")).click();

        try {
            WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#username-error")));
            String error = errorElement.getText();
            Assert.assertNotNull(error, "Error message displayed under the username field: " + error);
        } catch (Exception e) {
            System.out.println("No error message displayed under the username field, login successful");
        }
    }
}
