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
import java.util.List;

public class SearchTest {

    WebDriver driver;

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

    @Test
    public void searchTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[2]/div[1]/div[1]/button[1]"))).click();
        } catch (Exception e) {
            System.out.println("Cookies not displayed");
        }

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/button[1]"))).click();
        } catch (Exception e) {
            System.out.println("Ad not displayed");
        }

        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[2]/div[1]/div[2]/div[1]/form[1]/input[1]")));
        searchField.sendKeys("flowers");

        WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[2]/div[1]/div[2]/div[1]/form[1]/button[1]/img[1]")));
        searchButton.click();

        wait.until(ExpectedConditions.urlContains("https://4u.am/hy/product/search?text=flowers&type="));

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://4u.am/hy/product/search?text=flowers&type=";
        Assertions.assertEquals(expectedUrl, currentUrl, "Current URL does not match expected URL");

        List<WebElement> searchResults = driver.findElements(By.xpath("//body/section[4]/div[2]/div[3]/*"));
        System.out.println("Number of products in the list: " + searchResults.size());
        for (WebElement result : searchResults) {
            String resultText = result.getText();
            System.out.println(resultText);
        }
    }
}
