package com.shanemulcair.main;

import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s",s1);
            System.out.printf("%03d",x);
            //Complete this line
        }
        System.out.println("================================");

}

}
