package com.shanemulcair.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author mulcas4
 *
 */
public class Problem1 {

	public int getSumofMultiples(int a, int b, int ceiling){
		List<Integer> multiples=new ArrayList<Integer>();
		for(int i=0;i<ceiling;i++){
			if(i%a==0||i%b==0){
				multiples.add(i);
			}
		}
		return getSum(multiples);
	}
	private int getSum(List<Integer> multiples){
		int sum=0;
		for(int i: multiples){
			sum+=i;
		}
		return sum;
	}
}
