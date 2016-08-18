package com.shanemulcair.main;

import java.util.Scanner;

public class CircularArray {

	public static void main(String[] args) {
		int arraySize = 0;
		int numRotations = 0;
		int numQueries = 0;
		Scanner scan = new Scanner(System.in);
		arraySize = scan.nextInt();
		numRotations = scan.nextInt();
		numQueries = scan.nextInt();
		int[] nums = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			nums[i] = scan.nextInt();
		}
		int[] output = rotateArrayEfficiently(nums, numRotations,arraySize);
		for (int count = 0; count < numQueries; count++) {
			int curr = scan.nextInt();
			System.out.println(output[curr]);
		}
		scan.close();
	}

	private static int[] rotateArrayEfficiently(int[] input, int rotatecount,int arraySize) {
		int[] output=new int[arraySize];
		for(int i=0;i<input.length;i++){
			int j=i+rotatecount;
			if(j<arraySize){
				output[j]=input[i];
			}
			else{
				j=j%arraySize;
				output[j]=input[i];
			}
		}
		return output;
	}

}
