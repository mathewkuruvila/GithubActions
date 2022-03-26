package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class LoginTest {

	@Test
	@Description("Test Description: Login test with wrong username and wrong password. loginDemoTest1")
	public void loginDemoTest1() {
		System.out.println("loginDemoTest1");
		createAttachment();
		Assert.fail("Failed the test");
	}
	
	@Test
	public void loginDemoTest2() {
		System.out.println("DemoTest 2");
		createAttachment();
		login();
	}
	
	
	@Test
	public void loginDemoTest3() {
		System.out.println("DemoTest 3");
		
	}
	
	
	@Test
	public void loginDemoTest4() {
		System.out.println("DemoTest 4");
		login();
	}
	
	@Step("This is the a new step")
	public void login() {
		System.out.println("Login");
		Assert.fail("Failed the test");
	}
	
	@Attachment(value = "My cool attachment")
	private byte[] createAttachment() {
	    String content = "attachmentContent";
	    return content.getBytes();
	} 
}
