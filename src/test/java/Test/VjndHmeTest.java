package Test;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page.VijayanandHome;

public class VjndHmeTest extends VijayanandBase{
	@Test
	public void test() throws IOException, InterruptedException
	{
		
		VijayanandHome ob=new VijayanandHome(driver);
		Thread.sleep(3000);
		ob.click();
		
		ob.setValues("AMMENALLI", "MURDESHWAR", "25-07-2023");
		
	}

}
