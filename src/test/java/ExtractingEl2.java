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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtractingEl2
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
    public void testClickOptionFromDropdown() {
        WebElement dropdownByXPath = driver.findElement(By.xpath("//header/div[2]/div[1]/div[2]/div[1]/form[1]/select[1]"));
        WebElement dropdownByCssSelector = driver.findElement(By.cssSelector("div.middle_header:nth-child(2) div.menu.desktop_menu div.search_new:nth-child(5) div.search_form form:nth-child(1) > select:nth-child(2)"));
        WebElement dropdownByAbsXPath = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/div[2]/div[1]/form[1]/select[1]"));

        dropdownByXPath.click();

        WebElement optionByXPath = driver.findElement(By.xpath("//header/div[2]/div[1]/div[2]/div[1]/form[1]/select[1]/option[2]"));
        WebElement optionByCssSelector = driver.findElement(By.cssSelector("div.middle_header:nth-child(2) div.menu.desktop_menu div.search_new:nth-child(5) div.search_form form:nth-child(1) select:nth-child(2) > option:nth-child(2)"));
        WebElement optionByAbsXPath = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/div[2]/div[1]/form[1]/select[1]/option[2]"));

        optionByXPath.click();

        Assertions.assertEquals(dropdownByXPath, dropdownByCssSelector);
        Assertions.assertEquals(dropdownByXPath, dropdownByAbsXPath);
        Assertions.assertEquals(optionByXPath, optionByCssSelector);
        Assertions.assertEquals(optionByXPath, optionByAbsXPath);
    }

}
