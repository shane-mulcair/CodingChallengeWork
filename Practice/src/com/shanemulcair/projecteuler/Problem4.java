package com.shanemulcair.projecteuler;

import java.util.ArrayList;
import java.util.List;

/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers. 
 */
public class Problem4 {

	public int getLargestPalindrome(int a,int b){
		List<Integer> palindromes=new ArrayList<Integer>();
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				int product=i*j;
				String temp=Integer.toString(product);
				boolean palindrome=true;
				for(int k=0;k<temp.length()/2;k++){
					
					if(temp.charAt(k)!=temp.charAt(temp.length()-(k+1))){
						palindrome=false;
					}
				}
				if(palindrome){
					palindromes.add(product);
				}
			}
		}
		
		return getLargest(palindromes);
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
