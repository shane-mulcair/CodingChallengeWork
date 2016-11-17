package com.shanemulcair.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shanemulcair.main.ReducedString;

public class ReducedStringTest {
	ReducedString rs;
	@Before
	public void setUp() throws Exception {
		rs=new ReducedString();
	}

	@After
	public void tearDown() throws Exception {
		rs=null;
	}

	@Test
	public void testReduceString1() {
		assertEquals(rs.reduceString("aaabccddd"),"abd");
	}
	@Test
	public void testReduceString2() {
		assertEquals(rs.reduceString("baab"),"Empty String");
	}
	@Test
	public void testReduceString3() {
		assertEquals(rs.reduceString("aa"),"Empty String");
	}

}
