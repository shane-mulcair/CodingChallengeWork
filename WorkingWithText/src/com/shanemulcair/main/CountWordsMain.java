package com.shanemulcair.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
/***
 * 
 * Working on basic string/map manipulation
 * Probably allocating too many objects, most of it is to get outputs.
 * hard-coded path to a Sherlock Holmes book from Project Gutenburg.
 * Most common word: "the"
 * Most common letter: "e" (as expected)
 * @author mulcas4
 *
 */
public class CountWordsMain {

	public static void main(String args[]) {
		String filename = "C:\\Users\\mulcas4\\EclipseProjects\\pg108.txt";
		Map<String, Integer> wordmap = new HashMap<String, Integer>();
		Map<String, Integer> charmap = new HashMap<String, Integer>();
		Stream<String> st=getStreamOfLinesFromFile(filename);
		wordmap=getMapOfWordsFromStream(st);
		st=getStreamOfLinesFromFile(filename);
		charmap=getMapofCharsFromStream(st);
		System.out.println("Size of char array: "+charmap.size());
		String mostCommonLetter=getMostCommonWord(charmap);
		System.out.println("Most common letter is: "+mostCommonLetter);
		String mostCommonWord=getMostCommonWord(wordmap);
		System.out.println("Most common word in "+filename+" is \""+mostCommonWord+"\"");
	}

	private static Stream<String> getStreamOfLinesFromFile(String filename) {
		Stream<String> stream = null;
		try {
			stream = Files.lines(Paths.get(filename));
		} catch (IOException e) {
			System.out.println("Failed to access the given file: "+filename);
			e.printStackTrace();
		}
		return stream;
	}
	
	private static Map<String,Integer> getMapOfWordsFromStream(Stream<String> input){
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] lines = input.toArray(String[]::new);
		for (String s : lines) {
			String[] words = s.split(" ");
			for (String w : words) {
				if (map.containsKey(w)) {
					map.replace(w, map.get(w) + 1);
				} else {
					map.put(w, 1);
				}
			}
		}
		return map;
	}
	
	private static String getMostCommonWord(Map<String,Integer> map){
		int maxNum = 0;
		String mostCommon = "";
		for (String s : map.keySet()) {
			if (map.get(s) > maxNum) {
				maxNum = map.get(s);
				mostCommon = s;
			}
		}
		return mostCommon;
	}
	
	private static Map<String,Integer> getMapofCharsFromStream(Stream<String> input){
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] lines = input.toArray(String[]::new);
		for(String s:lines){
			char[] chars=s.toCharArray();
			for(char c:chars){
				if (c!=' '&&map.containsKey(String.valueOf(c))) {
					map.replace((String.valueOf(c)), map.get(String.valueOf(c)) + 1);
				} else {
					map.put((String.valueOf(c)), 1);
				}
			}
		}
		return map;
	}
}
