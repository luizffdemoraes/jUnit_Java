package com.schoolofnet.junit_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SuiteCaseTest1 {
	
	@Test
	public void calc() {
		assertEquals(4, 2 + 2);
	}

}
