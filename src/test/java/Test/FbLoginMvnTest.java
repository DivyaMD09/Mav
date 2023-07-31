package Test;

import org.testng.annotations.Test;

import Page.FbLoginMvnPge;

public class FbLoginMvnTest extends FbBaseClass{

	@Test
	public void loginTest()
	{
		FbLoginMvnPge ob=new FbLoginMvnPge(driver);
		ob.setvalues("abc@gmail.com", "1234");
		ob.login();
	}

}
