package com.shanemulcair.utilities;

public class Combinations {

	public static void main(String[] args) {

		String[] list={"a","b","c"};
		for (int i=0;i<3;i++){
			String s="";
			s+=list[i];
			s+=list[(i+1)%3];
			s+=list[(i+2)%3];
			System.out.println(s);
		}
	}

}
