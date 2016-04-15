package com.shanemulcair.projecteuler;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem7 {

	public long getSpecificPrime(int target){
		long current=2;
		int count=0;
		while(count<target){
			if(isPrime(current)){
				count++;
				if(count<target){
					current++;
				}
			}
			else{
			current++;
			}
		}
		return current;
	}
	
	private boolean isPrime(long input){
		for(int i=2;i<input;i++){
			if(input%i==0){
				return false;
			}
		}
		return true;
	}
}
