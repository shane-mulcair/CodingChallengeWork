package com.shanemulcair.main;

public class ReducedString {

	public String reduceString(String s){
		while(reduceS(s).length()<s.length()){
			
			s=reduceS(s);
			System.out.println(s);
		}
		if(s.length()==0){
			return "Empty String";
		}
		return s;
		
	}
	
	private String reduceS(String s){
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		for(int i=1;i<sb.length();i++){
			if(sb.charAt(i-1)==sb.charAt(i)){
				sb.replace(i-1, i+1, "");
			}
		}
		return sb.toString();
	}
}
