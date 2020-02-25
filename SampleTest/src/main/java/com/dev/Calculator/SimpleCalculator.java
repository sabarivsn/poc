package com.dev.Calculator;

public class SimpleCalculator {

	public long add(long... inputs)
	{
		long result = 0;
		for(long l : inputs)
		{
			result += l;
		}
		return result;
	}
	
	public long subtract(long... inputs)
	{
		long result = 0;
		for(long l : inputs)
		{
			result -= l;
		}
		return result;
	}
	
	public long product(long... inputs)
	{
		long result = 0;
		for(long l : inputs)
		{
			result *= l;
		}
		return result;
	}
}
