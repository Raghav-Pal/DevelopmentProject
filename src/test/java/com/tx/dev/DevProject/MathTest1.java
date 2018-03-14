package com.tx.dev.DevProject;

import junit.framework.TestCase;

public class MathTest1 extends TestCase {

	public void testSum() {
		///assertEquals(expected, actual);
		assertEquals(30, Math.sum(10, 20));
	}

	public void testSub() {
		assertEquals(10, Math.sub(30, 10));
	}
	
	public void testMul() {
		assertEquals(10, Math.mul(5, 2));
	}
	
	public void testDiv() {
		assertEquals(5, Math.div(10, 2));
	}

}
