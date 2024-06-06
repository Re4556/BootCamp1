import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigateAndVerifyElementsTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testNavigateAndVerifyElements() {
     
        String url = "http://tutorialsninja.com/demo/";
        driver.get(url);

        
        WebElement laptopsAndNotebooksLink = driver.findElement(By.linkText("Laptops & Notebooks"));
        laptopsAndNotebooksLink.click();

    
        WebElement pageTitle = driver.findElement(By.tagName("h2"));
        WebElement gridViewButton = driver.findElement(By.id("grid-view"));
        WebElement listViewButton = driver.findElement(By.id("list-view"));


        Assert.assertTrue(pageTitle.isDisplayed(), "Page title is not displayed");
        Assert.assertTrue(gridViewButton.isDisplayed(), "Grid view button is not displayed");
        Assert.assertTrue(listViewButton.isDisplayed(), "List view button is not displayed");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}