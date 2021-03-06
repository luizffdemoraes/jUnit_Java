package com.schoolofnet.junit_maven;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import static com.schoolofnet.junit_maven.isEmptyString.*;
import static com.schoolofnet.junit_maven.DivisibleBy.*;

import java.util.Arrays;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

public class AssertTest {
	
	@Test
	public void testAssert() {
		String str1 = "jUnit";
		String str2 = "jUnit";
		Integer int1 = 1;
		Integer int2 = 1;
		Boolean teste = true;
		Integer a = null;
	//	Arrays.asList(null)
		int [] array1 = { 1, 2, 3, 4 };
		int [] array2 = { 1, 2, 3, 4 };
	/*
		assertEquals(str1, str2);
		assertSame(int1, int2);
		assertNotSame(str1, int1);
		assertNotNull(str1);
		assertTrue(teste);
		assertArrayEquals(array1, array2);
		assertThat(str1, is("jUnit"));
		assertThat(str1, isA(String.class));
		assertThat("Not equals", "123", is("123"));	
	*/
		
		String tst = "";
		Integer tst2 = 4;
		
		assertThat(tst, is(isEmpty(tst)));
		assertThat(tst2, is(divisibleBy(2)));
	}

}
