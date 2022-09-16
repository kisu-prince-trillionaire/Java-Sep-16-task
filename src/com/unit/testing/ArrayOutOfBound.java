package com.unit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArrayOutOfBound {
	@Test
	@DisplayName(value = "ArrayCheck")
	public void testArrayEquality() {
		int[] marksStudent = { 10, 20, 30, 40 };
		MyArray obj = new MyArray();
		assertArrayEquals(marksStudent, obj.getArray());
	}

	@Test
	@DisplayName(value = "ArrayIndex")
	public void testArrayIndexOutOfBound() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			MyArray.dumpArray();
		});

	}
}
