package com.shanemulcair.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<String> answers=new ArrayList<String>();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int count=0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i]<=0){
                	count++;
                }
            }
            if(count<k){
            	answers.add("YES");
            }
            else{
            	answers.add("NO");
            }
        }
        in.close();
        for(String s:answers){
        	System.out.println(s);
        }
        
    }

}
