package com.shanemulcair.main;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int count=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        count=getDSP(n,k,a);
        System.out.println(count);
    }
	
	public static int getDSP(int n,int k,int[]a){
		int count=0;
        for(int i=0; i<n;i++){
        	for(int j=i+1;j<n;j++){
        		if(((a[i]+a[j])%k==0)){
        			count++;
        		}
        	}
        }
        return count;
	}

}
