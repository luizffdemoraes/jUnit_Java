package com.schoolofnet.junit_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
	
	@Test
	public void testConcatenate() {
		StringUtils util = new StringUtils();
		
		String res = util.concatenate("SON", " JUnit");
		
		assertEquals("SON JUnit", res);
	}

}
