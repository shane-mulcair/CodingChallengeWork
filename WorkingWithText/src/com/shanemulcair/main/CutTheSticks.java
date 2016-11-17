package com.shanemulcair.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> sticks=new ArrayList<Integer>(); 
        for(int arr_i=0; arr_i < n; arr_i++){
        	sticks.add(in.nextInt());
        }
        while(sticks.size()>0){
        	sticks=cutSticks(sticks);
        }
        in.close();
    }
	public static List<Integer> cutSticks(List<Integer> sticks){
		int min=Integer.MAX_VALUE;
		int cutCount=0;
		for(int i:sticks){
			if(i<min){
				min=i;
			}
		}
		List<Integer> cutSticks=new ArrayList<Integer>();
		for(int i:sticks){
			int currLength=i-min;
			cutCount+=1;
			if(currLength>0){
				cutSticks.add(currLength);
			}
		}
		System.out.println(cutCount);
		return cutSticks;
	}
}
