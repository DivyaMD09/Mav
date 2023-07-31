package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginMvnPge {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpass=By.id("pass");
	By fblogin=By.name("login");
	By cr_page=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	
	public FbLoginMvnPge(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpass).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}

}
