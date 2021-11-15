package com.schoolofnet.junit_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GreaterThanTest {

	private GreaterThan validate;
	private Boolean exResult;
	private Integer numbers;
	
	public GreaterThanTest(GreaterThan validate, Boolean exResult, Integer numbers) {
		this.validate = validate;
		this.exResult = exResult;
		this.numbers = numbers;
	}

	@Before
	public void initialize() {
		validate = new GreaterThan();
	}
	
	@Parameters
	public static Collection setNumbers() {
		return Arrays.asList(new Object[][] {
			{ 10, true },
			{ 50, true },
			{  1, false},
			{  2, false},
			{  4, false}
		});
	}
	
	@Test
	public void greaterThenTest() {
		System.out.println("Testing...");
		assertEquals(exResult, validate.validate(numbers));
	}

	@After
	public void close() {
		this.validate = null;
	}
	
	
	
}
