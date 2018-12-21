package com.techelevator;

import org.junit.*;

public class JUnitAnnotationTest {

	    // Run once, e.g. Database connection, connection pool
	    @BeforeClass
	    public static void runOnceBeforeClass() {
	        System.out.println("@BeforeClass - runOnceBeforeClass");
	    }

	    // Run once, e.g close connection, cleanup
	    @AfterClass
	    public static void runOnceAfterClass() {
	        System.out.println("@AfterClass - runOnceAfterClass");
	    }

	    // Runs Before Each Test Method
	    @Before
	    public void runBeforeTestMethod() {
	    	// e.g. Creating a test data / object and share for all tests in the class
	        System.out.println("@Before - runBeforeTestMethod");
	    }

	    // Runs After Each Test Method
	    @After
	    public void runAfterTestMethod() {
	        System.out.println("@After - runAfterTestMethod");
	    }

	    @Test
	    public void test_method_1() {
	        System.out.println("@Test - test_method_1");
	    }

	    @Test
	    public void test_method_2() {
	        System.out.println("@Test - test_method_2");
	    }	
	
}
