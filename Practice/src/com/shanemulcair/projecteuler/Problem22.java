package com.shanemulcair.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.shanemulcair.utilities.FileAccess;

public class Problem22 {
/*
 * Using names.txt (right click and 'Save Link/Target As...'),
 *  a 46K text file containing over five-thousand first names, 
 *  begin by sorting it into alphabetical order. Then working out 
 *  the alphabetical value for each name, multiply this value by 
 *  its alphabetical position in the list to obtain a name score.
 *  For example, when the list is sorted into alphabetical order,
 *  COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th
 *  name in the list. So, COLIN would obtain a score of 
 *  938 × 53 = 49714.
 *  What is the total of all the name scores in the file?
 */
	public long getNamesScores(){
		FileAccess fa=new FileAccess();
		long wordScoresTotal=0;
		List<String> inputs=new ArrayList<String>();
		List<String> fixedInput=new ArrayList<String>();
		inputs=fa.readFromFile("C:\\tools\\workspace\\Practice\\euler_problem22_names.txt");
		fixedInput=splitAndStrip(inputs.get(0));
		for(int i=0;i<fixedInput.size();i++){
//			System.out.println("Name: "+fixedInput.get(i));
//			System.out.println("Position: "+(i+1));
//			System.out.println("Word Score: "+getWordScore(fixedInput.get(i)));
			wordScoresTotal+=((i+1)*getWordScore(fixedInput.get(i)));
		}
		System.out.println(getWordScore("COLIN")*(fixedInput.indexOf("COLIN")+1));
		System.out.println(fixedInput.indexOf("COLIN")+1);
		return wordScoresTotal;
	}
	
	private List<String> splitAndStrip(String input){
		List<String> splits=new ArrayList<String>();
		input.replace("\"", " ");
		for(String s:input.split(",")){
			splits.add(s.substring(1, s.length()-1));
		}
		Collections.sort(splits);
		return splits;
	}
	
	private int getWordScore(String input){
		int score=0;
		for(char c:input.toCharArray()){
			score+=((int)c-64);
		}
		return score;
		
	}
}
