package com.qa.Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dev.Calculator.SimpleCalculator;

public class SimpleTests {

	@Test
	public void testAddMethod()
	{
		SimpleCalculator sc = new SimpleCalculator();
		long result = sc.add(2569,10);
		Assert.assertEquals(result, 2579);
	}
}
