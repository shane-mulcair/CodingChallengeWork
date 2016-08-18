package com.shanemulcair.main;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for(int i=1;i<=n;i++){
        	System.out.println(new String(new char[n-i]).replace("\0", " ")+(new String(new char[i]).replace("\0", "#")));
        }
    }
}
