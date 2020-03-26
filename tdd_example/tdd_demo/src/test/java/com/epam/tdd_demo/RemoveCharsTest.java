package com.epam.tdd_demo;

import static org.junit.Assert.*;
import org.junit.Test;
public class RemoveCharsTest {

	@Test
	public void test2chars() {
		RemoveFirst2Chars obj = new RemoveFirst2Chars();
		String actual = obj.remove("BB");
		assertEquals("BB", actual);  
	}
	
	@Test
	public void test1char() {
		RemoveFirst2Chars obj = new RemoveFirst2Chars();
		String actual = obj.remove("B");
		assertEquals("B", actual);
	}
	
	@Test
	public void testNchars() {
		RemoveFirst2Chars obj = new RemoveFirst2Chars();
		String actual = obj.remove("AABAA");
		assertEquals("BAA", actual);
	}
	
	@Test
	public void testEmptychar() {
		RemoveFirst2Chars obj = new RemoveFirst2Chars();
		String actual = obj.remove("");
		assertEquals("", actual);
	}

}
