package com.shanemulcair.main;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        float totalPos=0.0f;
        float totalNeg=0.0f;
        float totalZero=0.0f;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]<0){
            	totalNeg++;
            }
            else if(arr[arr_i]==0){
            	totalZero++;
            }
            else{
            	totalPos++;
            }
        }
        in.close();
        System.out.println(String.format("%.6f",totalPos/(float)n));
        System.out.println(String.format("%.6f",totalNeg/(float)n));
        System.out.println(String.format("%.6f",totalZero/(float)n));
        
        
    }

}
