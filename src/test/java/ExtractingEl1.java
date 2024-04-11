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

public class ExtractingEl1
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

    @Test
    public void testDifferentLocationStrategies() {
        System.setProperty("webdriver.chrome.driver", ".idea/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://4u.am/");
        driver.manage().window().maximize();

        WebElement inputFieldByXPath = driver.findElement(By.xpath("//header/div[2]/div[1]/div[2]/div[1]/form[1]/input[1]"));
        WebElement inputFieldByCssSelector = driver.findElement(By.cssSelector("div.middle_header:nth-child(2) div.menu.desktop_menu div.search_new:nth-child(5) div.search_form form:nth-child(1) > input:nth-child(1)"));
        WebElement inputFieldByAbsoluteXPath = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/div[2]/div[1]/form[1]/input[1]"));

        inputFieldByXPath.sendKeys("Text entered via XPath");
        inputFieldByCssSelector.sendKeys("Text entered via CSS Selector");
        inputFieldByAbsoluteXPath.sendKeys("Text entered via Absolute XPath");

        Assertions.assertFalse(inputFieldByXPath.getAttribute("value").isEmpty(), "Input field via XPath is empty");
        Assertions.assertFalse(inputFieldByCssSelector.getAttribute("value").isEmpty(), "Input field via CSS Selector is empty");
        Assertions.assertFalse(inputFieldByAbsoluteXPath.getAttribute("value").isEmpty(), "Input field via Absolute XPath is empty");

        driver.quit();
    }
}