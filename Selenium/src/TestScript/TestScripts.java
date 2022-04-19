package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Pom_Script.Pom_Login;
import generic.Base_class;
import generic.Generic_Excel;

public class TestScripts extends Base_class {
	@Test
	public static void test() throws EncryptedDocumentException, IOException
	{
		String un = Generic_Excel.getdata("sheet1", 0, 0);
		String pwd = Generic_Excel.getdata("sheet1", 1, 0);
		String txt = Generic_Excel.getdata("sheet1", 2, 0);
		
		Pom_Login pm = new Pom_Login(driver);
		
		pm.Username(un);
		pm.Password(pwd);
		pm.Loginbutton();
		pm.Searchbox(txt);
	}
}
