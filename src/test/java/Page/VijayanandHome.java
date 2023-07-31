package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class VijayanandHome {
	WebDriver driver;
	By source=By.id("FromCity");
	By destination=By.id("ToCity");
	By date=By.id("txtFromDate");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	By popup=By.xpath("//*[@id=\"largeModal\"]/div/div/button");
	
	public VijayanandHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setValues(String src,String dest,String dte)
	{
		driver.findElement(source).sendKeys(src);
		driver.findElement(destination).sendKeys(dest);
		driver.findElement(date).clear();
		driver.findElement(date).sendKeys(dte);
		
	}
	
	public void search()
	{
		driver.findElement(search).click();
	}
	
	public void click()
	{
		driver.findElement(popup).click();
		
	}
	
	
}
