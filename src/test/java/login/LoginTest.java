package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class LoginTest {

	@Test
	@Description("Test Description: Login test with wrong username and wrong password. loginDemoTest1")
	public void loginDemoTest1() {
		System.out.println("loginDemoTest1");
	}
	
	@Test
	public void loginDemoTest2() {
		System.out.println("DemoTest 2");
	}
	
	
	@Test
	public void loginDemoTest3() {
		System.out.println("DemoTest 3");
		Assert.fail("Failed the test");
	}
	
	
	@Test
	public void loginDemoTest4() {
		System.out.println("DemoTest 4");
	}
}
