package welcome;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void demoTest1() {
		System.out.println("DemoTest 1");
		Assert.fail("Failed the test");
	}
	
	@Test
	public void demoTest2() {
		System.out.println("DemoTest 2");
	}
	
	
	@Test
	public void demoTest3() {
		System.out.println("DemoTest 3");
		Assert.fail("Failed the test");
	}
	
	
	@Test
	public void demoTest4() {
		System.out.println("DemoTest 4");
	}
}
