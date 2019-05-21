package com.learnmaven.demo.maven_demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testAdd() {
		assertEquals(25, new Calculator().add(10, 15));
	}

	public void testSubtract() {
		assertEquals(5, new Calculator().subtract(15, 10));
	}

	public void testMultiply() {
		assertEquals(150, new Calculator().multiply(10, 15));
	}

	public void testDivide() {
		assertEquals(10, new Calculator().divide(100, 10));
	}
}
