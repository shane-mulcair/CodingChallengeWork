package com.shanemulcair.projecteuler;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class Problem10 {

	public long getSumOfPrimes(int cap){
		long total=0;
		for(int i=2;i<cap;i++){
			if(isPrime(i)){
				total+=i;
			}
		}
		return total;
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
