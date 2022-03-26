package welcome;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class DemoTest {

	@Test
	@Description("Test Description: Login test with wrong username and wrong password. demoTest1")
	public void demoTest1() {
		System.out.println("DemoTest 1");
		login();
	}
	
	@Test
	@Description("Test Description: Login test with wrong username and wrong password. demoTest2")
	public void demoTest2() {
		System.out.println("DemoTest 2");
		login();
		loginAnother();
	}
	
	@Step("This is the login step")
	public void login() {
		System.out.println("Login");
		Assert.fail("Failed the test");
	}
	
	@Step("This is another login step")
	public void loginAnother() {
		System.out.println("Login");
		Assert.fail("Failed the test");
	}
	
	@Test
	@Description("Test Description: Login test with wrong username and wrong password. demoTest3")
	public void demoTest3() {
		System.out.println("DemoTest 3");
		loginAnother();
		Assert.fail("Failed the test");
	}
	
	
	@Test
	@Description("Test Description: Login test with wrong username and wrong password. demoTest4")
	public void demoTest4() {
		System.out.println("DemoTest 4");
		login();
	}
}
