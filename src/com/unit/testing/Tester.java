package com.unit.testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class Tester {
	Operation obj;

	@Test
	@DisplayName("Checking Result")
	public void testCheck() {
		boolean actualResult = obj.check(5);
		assertEquals(false, actualResult);
	}

	@Test
	@DisplayName("Check Even")
	public void testCheckEven() {
		boolean actualResult = obj.check(4);
		assertEquals(true, actualResult);
	}

	@Test
	@DisplayName("Check Odd")
	public void testCheckOdd() {
		boolean actualResult = obj.check(9);
		assertEquals(false, actualResult);
	}

	@Test
	@DisplayName("Check Zero")
	public void testCheckZero() {
		boolean actualResult = obj.check(0);
		assertEquals(true, actualResult);
	}

	@Test
	@DisplayName("Assert Not Equals")
	public void testCheckDivide() {
		double actualResult = obj.divide(4.8, 2.2);
		assertNotEquals(1.18, actualResult);
	}

	@Test
	@DisplayName("Assert true")
	public void testDivideNegative() {
		boolean actualResult = obj.compare(4, 2);
		assertTrue(actualResult);
	}

	@Test
	@DisplayName("Assert false")
	public void testCompare() {
		boolean actualResult = obj.compare(2, 4);
		assertFalse(actualResult);
	}

	@Test
	@DisplayName("Check For Null")
	public void testGetString() {
		assertNull(obj.getstring(null));
	}

	@Test
	@DisplayName("Assert throws exception")
	public void testString() {
		String str = obj.getstring(null);
		assertThrows(NullPointerException.class, () -> str.length());
	}

	@Test
	@DisplayName("Array Equals false")
	public void testArrayFalse() {
//		int a[] = { 10, 20, 30, 40 };
		int a[] = { 90, 80, 70, 60 };
		int b[] = { 90, 80, 70, 60 };
		assertArrayEquals(a, b);
	}

	@Test
	@DisplayName("Array Equals true")
	public void testArrayTrue() {
		int a[] = { 10, 20, 30, 40 };
		int b[] = { 10, 20, 30, 40 };
		assertArrayEquals(a, b);
	}

	@Test
	@DisplayName("Check For Name")
	public void testGetName() {
		assertNotNull(obj.getstring("Vishal"));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1,3,5,7,9,11 })
	@DisplayName("Value source")
	public void testCheckParameterized(int a) {
		boolean actualResult = obj.check(a);
		System.out.println("The no is : " + a);
		assertEquals(false, actualResult);
	}

	@ParameterizedTest
	@CsvSource({ "10,true", "12,true", "15,false", "30,true", "80,true", "40,true" })
	@DisplayName("Csv source")
	public void testCheckParameterizedCsv(int num, boolean value) {
		System.out.println("The no is : " + num);
		assertEquals(value, obj.check(num));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv")
	@DisplayName("Csv File Source")
	public void testCheckParameterizedCsvFile(int num, boolean value) {
		System.out.println("The no is : " + num);
		assertEquals(value, obj.check(num));
	}

	@BeforeEach
	public void beforeEachDemo() {
		obj = new Operation();
		System.out.println("before each");
	}

	@BeforeAll
	public static void beforeAllDemo() {
		System.out.println("before all");
	}

	@AfterEach
	public void afterEachDemo() {
		System.out.println("after each");
	}

	@AfterAll
	public static void afterAllDemo() {
		System.out.println("after all");
	}

}
