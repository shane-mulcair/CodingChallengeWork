package com.shanemulcair.main;

import java.util.Scanner;

public class IsPangram {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        scan.close();
        String inputLower=input.toLowerCase();
        int[] chars = new int[26];
        for(char c:inputLower.toCharArray()){
            if(c>='a'&&c<='z'){
                chars[(int)c-97]++;
            }
        }
        boolean isPangram=true;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==0){
                isPangram=false;
            }
        }
        
        if(isPangram){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
