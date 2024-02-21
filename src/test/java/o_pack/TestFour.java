package o_pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestFour {

	@AfterTest
	public void testm() {
		
		System.out.println("his will execute after test methods in every test modules in the testing.xml file");

	}
	@Test
	public void testFour() {
		
		System.out.println("Test 04 classes got executed");

	}

}