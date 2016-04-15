package com.shanemulcair.projecteuler;

/*
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first
 * ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first
 *  one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

	public long getSumSquareDifference(int range){
		return getSquareofSums(range)-getSumofSquares(range);
	}
	
	private long getSumofSquares(int range){
		long sumOS=0;
		for(int i=1; i<=range;i++){
			sumOS+=(i*i);
		}
		return sumOS;
	}
	
	private long getSquareofSums(int range){
		long squareOS=0;
		for(int i=1;i<=range;i++){
			squareOS+=i;
		}
		return squareOS*squareOS;
	}
}
