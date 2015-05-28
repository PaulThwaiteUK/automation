package com.idoodi.functions;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {

	@Test
	public void test_multiply() {
		
		Calculator calculate = new Calculator();
		assertEquals("4 * 6 = 24", 24, calculate.multiply(4, 6));
	}
	
	@Test
	public void test_add() {
		
		Calculator calculate = new Calculator();
		assertEquals("4 + 6 = 10", 10, calculate.add(4, 6));
	}
	
	@Test
	public void test_add_generateTestFailure() {
		
		Calculator calculate = new Calculator();
		assertEquals("4 * 6 = 24", 11, calculate.add(4, 6));
	}
	
	@Test
	public void test_divide() {
		
		Calculator calculate = new Calculator();
		assertEquals("40 / 4 = 10", 10, calculate.divide(40, 4));
	}

}
