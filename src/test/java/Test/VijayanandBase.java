package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VijayanandBase {
	WebDriver driver;
	String parentWindow;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
		parentWindow=driver.getWindowHandle();
		System.out.println("p"+ parentWindow);
		System.out.println("Parent Window Title"+driver.getTitle());
	}
}
