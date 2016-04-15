package com.shanemulcair.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.shanemulcair.projecteuler.Problem1;
import com.shanemulcair.projecteuler.Problem10;
import com.shanemulcair.projecteuler.Problem13;
import com.shanemulcair.projecteuler.Problem2;
import com.shanemulcair.projecteuler.Problem22;
import com.shanemulcair.projecteuler.Problem3;
import com.shanemulcair.projecteuler.Problem4;
import com.shanemulcair.projecteuler.Problem5;
import com.shanemulcair.projecteuler.Problem6;
import com.shanemulcair.projecteuler.Problem7;
import com.shanemulcair.projecteuler.Problem8;
import com.shanemulcair.projecteuler.Problem9;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Enter the number to select a test:");
		System.out.println("Problem 1: Sum of Multiples");
		System.out.println("Problem 2: Sum of Fibonacci sequence");
		System.out.println("Problem 3: Largest Prime Factor");
		System.out.println("Problem 4: Largest Palindrome");
		System.out.println("Problem 5: Smallest Common Multiple");
		System.out.println("Problem 6: Sum of Squares, Square of Sums Difference");
		System.out.println("Problem 7: Get a specific Prime");
		System.out.println("Problem 8: Get Largest Product");
		System.out.println("Problem 9: Get Pythagorean Product");
		System.out.println("Problem 10: Get the sum of Primes");
		System.out.println("Problem 13: Get the first 10 digits of a large sum");
		System.out.println("Problem 22: Get the word scores from the file");
		String option="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			option=br.readLine();
		} catch (IOException e) {
			System.out.println("Hang on, what the hell did you enter??");
			e.printStackTrace();
		}
		testRunner(option);
	}
	
	private static void testRunner(String option){
		switch(option){
		case "1":
			Problem1 p1=new Problem1();
			System.out.println(p1.getSumofMultiples(3, 5, 1000));
			break;
		case "2":
			Problem2 p2=new Problem2();
			System.out.println(p2.getSumOfFibonacci(4000000));
			break;
		case "3":
			Problem3 p3=new Problem3();
			System.out.println(p3.getLargestPrimeFactor(600851475143l));
			break;
		case "4":
			Problem4 p4=new Problem4();
			System.out.println(p4.getLargestPalindrome(999, 999));
			break;
		case "5":
			Problem5 p5=new Problem5();
			System.out.println(p5.getSmallestMultiple(1, 20));
			break;
		case "6":
			Problem6 p6=new Problem6();
			System.out.println(p6.getSumSquareDifference(100));
			break;
		case "7":
			Problem7 p7=new Problem7();
			System.out.println(p7.getSpecificPrime(10001));
			break;
		case "8":
			Problem8 p8=new Problem8();
			System.out.println(p8.getLargestProduct(13));
			break;
		case "9":
			Problem9 p9=new Problem9();
			System.out.println(p9.getPythagoreanProduct());
			break;
		case "10":
			Problem10 p10=new Problem10();
			System.out.println(p10.getSumOfPrimes(2000000));
			break;
		case "13":
			Problem13 p13=new Problem13();
			System.out.println(p13.getFirstTenDigits());
			break;
		case "22":
			Problem22 p22=new Problem22();
			System.out.println(p22.getNamesScores());
			break;
		default:
			System.out.println("Sorry, thats not a valid option!");
			break;
		}
	}

}
