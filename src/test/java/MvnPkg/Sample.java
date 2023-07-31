package MvnPkg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	EdgeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void test1()
	{
		
		driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_4']")).click();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();//cart
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();//sign in
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc@gmail.com");//enter email id
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();//hamburger
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles",Keys.ENTER);
		//driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		//OR
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	   // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();                  	
	}
}
