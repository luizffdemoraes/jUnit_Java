package com.schoolofnet.junit_maven;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import static com.schoolofnet.junit_maven.isEmptyString.*;
import static com.schoolofnet.junit_maven.DivisibleBy.*;

import java.util.Arrays;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.CoreMatchers.*;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.junit.jupiter.api.Test;

@FixMethodOrder(MethodSorters.JVM)
public class SuiteCaseTest2 {
	
	@Test
	public void sub() {
		assertThat(2 - 2, is(0));
	}
	
	@Test
	public void mult() {
		assertThat(200 * 1254, is(250800));
	}

}
