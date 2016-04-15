package com.shanemulcair.projecteuler;
/*
 * 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder.
 *  What is the smallest positive number that is evenly divisible
 *  by all of the numbers from 1 to 20?
 * 
 */
public class Problem5 {

	public long getSmallestMultiple(int rangeStart, int rangeFinish){
		boolean notFound=true;
		long multiple=1;
		int tempSum=0;
		int[] range=new int[rangeFinish-rangeStart];
		while(notFound){
			int j=0;
			for(int i=rangeStart;i<rangeFinish;i++){
				if(multiple%i==0){
					range[j]=0;
				}
				else{
					range[j]=1;
				}
				j++;
			}
			for(int k=0;k<j;k++){
				tempSum+=range[k];
			}
			if(tempSum==0){
				notFound=false;
			}
			else{
				tempSum=0;
				multiple++;
			}
		}
		return multiple;
	}
}
