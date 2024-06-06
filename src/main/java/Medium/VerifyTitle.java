

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

	

@Test

	public void LoginPage()
{

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	
	String my_title = driver.getTitle();
	System.out.println("Title is" +my_title); 
	String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	
	Assert.assertEquals(my_title, expectedTitle);
	System.out.println("Test is completed");
}
}