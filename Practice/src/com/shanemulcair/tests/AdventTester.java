package com.shanemulcair.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.shanemulcair.advent.Day9Part1;

public class AdventTester {
	Day9Part1 d9=null;
	@Before
	public void setUp(){
		Day9Part1 d9=new Day9Part1();
	}
	
	@Test
	public void test1(){
		assertEquals(0,d9.getShortestPath("C:\\tools\\workspace\\Day9Sample.txt"));
	}
}
