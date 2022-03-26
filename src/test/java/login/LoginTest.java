package login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
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
