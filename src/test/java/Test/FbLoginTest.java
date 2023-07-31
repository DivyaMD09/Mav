package Test;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.Test;

import MvnPkg.BaseClassFb;
import Page.FbLogin;
import Utilities.Excelutils;

public class FbLoginTest extends BaseClassFb {
	@Test
	public void verifyLoginWithValidCred()throws Exception, ElementClickInterceptedException
	{
		FbLogin p1=new FbLogin(driver);
		String x1="D:\\Software Testing\\Apache\\uname.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(x1,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutils.getCellValue(x1,Sheet,i,0);
			System.out.println("username....."+UserName);
			String Pwd=Excelutils.getCellValue(x1,Sheet,i,1);
			System.out.println("password....."+Pwd);
			p1.setvalues(UserName, Pwd);
			p1.Login();
			
			String expectedurl="";
			String actualurl=driver.getCurrentUrl();
			if(actualurl.equals(expectedurl))
			{
				System.out.println("Pass");
			}
			else
				System.out.println("Fail");
			
		}
	}

}
