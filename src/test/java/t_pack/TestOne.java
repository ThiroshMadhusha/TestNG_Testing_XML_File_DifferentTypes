package t_pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {

	@BeforeTest
	public void testm() {
		
		System.out.println("his will execute before test methods in every test modules in the testing.xml file");

	}
	@Test(priority=3)
	public void testOne() {
		
		System.out.println("Test 01 classes got executed");

	}

}
