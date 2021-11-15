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

import org.junit.jupiter.api.Test;

public class SuiteCaseTest2 {
	
	@Test
	public void sub() {
		assertThat(2 - 2, is(0));
	}

}
