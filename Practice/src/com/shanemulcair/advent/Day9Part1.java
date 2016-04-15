package com.shanemulcair.advent;

import java.util.ArrayList;
import java.util.List;

import com.shanemulcair.utilities.FileAccess;

public class Day9Part1 {

	public static int getShortestPath(String input){
		FileAccess fa=new FileAccess();
		List<String> inputs=fa.readFromFile(input);
		getUniqueCities(inputs);
		return 0;
	}
	
	private static List<String> getUniqueCities(List<String> input){
		List<String> output=new ArrayList<String>();
		for(String s:input){
			if(!output.contains(s.split(" ")[0])){
				output.add(s.split(" ")[0]);
				System.out.println(s.split(" ")[0]);
			}
			if(!output.contains(s.split(" ")[2])){
				output.add(s.split(" ")[2]);
				System.out.println(s.split(" ")[2]);
			}
		}
		return output;
	}
}
