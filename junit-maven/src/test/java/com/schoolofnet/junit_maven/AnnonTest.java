package com.schoolofnet.junit_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.TemporaryFolder;

public class AnnonTest {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@BeforeAll
	public static void beforeClassTest() {
		System.out.println("@Before Class executed");
		System.out.println("@Before annon executed");
	}
	
	@Test
	@Disabled
	public void testOneTest() {
		System.out.println("@Test one");
	}
	
	@Test
	@Disabled
	public void testTwoTest() {
		System.out.println("@Test two");
	}
	
	@Test()
	@Ignore
	public void divideIntegerByZero() {
		  assertThrows(ArithmeticException.class, new Executable() {
			public void execute() throws Throwable {
			    int result = 12 / 0;
			}
		});
	}
	
	@Test()
	public void createFolderRuleTest() throws IOException {
		File folder = null; 
		try {
			folder = this.folder.newFolder("My Folder");
			Assert.assertTrue(folder.exists());
		} catch (Exception e) {
			Assert.assertFalse(folder.exists());
		}
		
	}
		
	
	@AfterAll
	public static void afterClassTest() {
		System.out.println("@After annon executed");
		System.out.println("@After Class executed");
	}
	

}
