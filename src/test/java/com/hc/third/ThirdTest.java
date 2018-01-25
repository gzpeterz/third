package com.hc.third;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThirdTest {

	@Test
	public void testSayHello() {
		Third third = new Third();
		String str = third.sayHello("dog");
		assertEquals("Hello cat cat dog", str);
	}

}
