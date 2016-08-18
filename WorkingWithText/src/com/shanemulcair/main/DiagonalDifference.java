package com.shanemulcair.main;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        in.close();
        int diagonalA=0;
        int diagonalB=0;
        int j=a.length-1;
        for(int i=0;i<a.length;i++){
        	diagonalA+=a[i][i];
        	diagonalB+=a[j][i];
        	j--;
        }
        System.out.println(Math.abs(diagonalA-diagonalB));
    }

}
