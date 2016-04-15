package com.shanemulcair.projecteuler;

import java.util.ArrayList;
import java.util.List;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
public class Problem3 {

	public long getLargestPrimeFactor(long input){
		List<Integer> factors=new ArrayList<Integer>();
		for(long i=1; i<input/2;i++){
			if(input%i==0){
				if(isPrime(i)){
					factors.add((int)i);
				}
			}
		}
		return getLargest(factors);
	}
	private boolean isPrime(long input){
		for(int i=4;i<input;i++){
			if(input%i==0){
				return false;
			}
		}
		return true;
	}
	private int getLargest(List<Integer> inputs){
		int largest=0;
		for(int i:inputs){
			if(i>largest){
				largest=i;
			}
		}
		return largest;
		
	}
}
