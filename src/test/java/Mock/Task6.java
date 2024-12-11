package Mock;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Baseclass.Vtigerbaseclass;
import com.crm.pom.Orgnization;
@Listeners(com.crm.listeners.ExtentReportAndScreenShot.class)
public class Task6 extends Vtigerbaseclass {
	
	@Test
	public void orgIndu() throws IOException
	{
		
		Orgnization ref2=new Orgnization(driver);
		ref2.organizationLink();
		ref2.plus_button();
		ref2.org_name();
		ref2.indDropDwon();
		ref2.save();
		assertTrue(ref2.getindutstrytext().getText().contains("Banking"));
	}

}