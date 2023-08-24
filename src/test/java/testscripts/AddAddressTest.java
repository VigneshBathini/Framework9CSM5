package testscripts;

import java.util.Map;

import org.testng.Assert;

import genericLibraries.BaseClass;

public class AddAddressTest extends BaseClass{

	public void addAddressTest() throws InterruptedException  {
		Map<String, String> map = excel.getData("sheet1", "Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		home.clickProfileButton();
		Thread.sleep(2000);
		myProfile.clickMyaddress();
		myAddress.clickAddAddress();
		
		address.addAddressDetails(webUtil, map);
		Thread.sleep(2000);
		Assert.assertEquals(myAddress.getSuccesMessage(),"successfully added");
		Thread.sleep(2000);
		
		
		
	}
	
}
