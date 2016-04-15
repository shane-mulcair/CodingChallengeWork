package com.shanemulcair.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shanemulcair.projecteuler.Problem1;
import com.shanemulcair.projecteuler.Problem10;
import com.shanemulcair.projecteuler.Problem2;
import com.shanemulcair.projecteuler.Problem3;
import com.shanemulcair.projecteuler.Problem4;
import com.shanemulcair.projecteuler.Problem5;
import com.shanemulcair.projecteuler.Problem6;
import com.shanemulcair.projecteuler.Problem7;
import com.shanemulcair.projecteuler.Problem8;
import com.shanemulcair.projecteuler.Problem9;

public class Tester {

	public static Problem1 p1;
	public static Problem2 p2;
	public static Problem3 p3;
	public static Problem4 p4;
	public static Problem5 p5;
	public static Problem6 p6;
    public static Problem7 p7;
    public static Problem8 p8;
    public static Problem9 p9;
    public static Problem10 p10;
	
	@Before
	public void setUp() throws Exception {
		p1=new Problem1();
		p2=new Problem2();
		p3=new Problem3();
		p4=new Problem4();
		p5=new Problem5();
		p6=new Problem6();
		p7=new Problem7();
		p8=new Problem8();
		p9=new Problem9();
		p10=new Problem10();
	}

	

	@Test
	public void testProblem1Example() {
		assertEquals(23, p1.getSumofMultiples(3, 5, 10));
	}
	
	@Test
	public void testProblem1(){
		assertEquals(233168,p1.getSumofMultiples(3, 5, 1000));
	}
	
	@Test
	public void testProblem2Example(){
		assertEquals(44,p2.getSumOfFibonacci(100));
	}
	
	@Test
	public void testProblem2(){
		assertEquals(4613732,p2.getSumOfFibonacci(4000000));
	}
	
	@Test
	public void testProblem3Example(){
		assertEquals(29l,p3.getLargestPrimeFactor(13195));
	}
	
//	@Test
//	public void testProblem3(){
//		assertEquals(6857l,p3.getLargestPrimeFactor(600851475143l));
//	}
	
	@Test
	public void testProblem4Example(){
		assertEquals(9009,p4.getLargestPalindrome(99, 99));
	}
	
	@Test
	public void testProblem4(){
		assertEquals(906609,p4.getLargestPalindrome(999, 999));
	}
	
	@Test
	public void testProblem5Example(){
		assertEquals(2520l,p5.getSmallestMultiple(1, 10));
	}
	
//	@Test
//	public void testProblem5(){
//		assertEquals(232792560l,p5.getSmallestMultiple(1, 20));
//	}
	
	@Test
	public void testProblem6Example(){
		assertEquals(2640l,p6.getSumSquareDifference(10));
	}
	
	@Test
	public void testProblem6(){
		assertEquals(25164150l, p6.getSumSquareDifference(100));
	}
	
	@Test
	public void testProblem7Example(){
		assertEquals(13l,p7.getSpecificPrime(6));
	}
	
	@Test
	public void testProblem8Example(){
		assertEquals(5832l,p8.getLargestProduct(4));
	}
	
	@Test
	public void testProblem8(){
		assertEquals(23514624000l,p8.getLargestProduct(13));
	}
	
	@Test
	public void testProblem9(){
		assertEquals(31875000,p9.getPythagoreanProduct());
	}
	
	@Test
	public void testProblem10Example(){
		assertEquals(17,p10.getSumOfPrimes(10));
	}
	
	@After
	public void tearDown() throws Exception {
		p1=null;
		p2=null;
		p3=null;
		p4=null;
		p5=null;
		p6=null;
		p7=null;
		p8=null;
		p9=null;
		p10=null;
	}
	
	
	
	
	

}
