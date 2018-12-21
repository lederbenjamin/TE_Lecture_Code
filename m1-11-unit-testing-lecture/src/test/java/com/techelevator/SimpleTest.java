package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SimpleTest {

	
	private Simple simple;
	
	
	@Before
	public void setup() {
		simple = new Simple();	
	}

	@Test
	public void testSimpleIsNotNull() {
		Assert.assertNotNull("Simple should not be null", simple);
	}
	
	
	@Test
	public void testAdd() {
	
		Assert.assertEquals("Sum should be equal to 4", 4, simple.add(2, 2));
		Assert.assertEquals("Sum should be equal to 6", 6, simple.add(2, 4));
	}	
	
	@Test
	public void testMultiply() {
		Assert.assertEquals("Product of (2)x(2) should be equal to 4", 4, simple.multiply(2, 2));
		Assert.assertEquals("Product of (2)x(3) should be equal to 6", 6, simple.multiply(2, 3));
	}	

}
