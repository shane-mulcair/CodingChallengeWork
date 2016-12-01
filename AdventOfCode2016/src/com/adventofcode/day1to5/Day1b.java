package com.adventofcode.day1to5;

import java.util.ArrayList;
import java.util.List;

import com.adventofcode.utilities.FileAccess;

public class Day1b {

	public static void main(String[] args) {
		FileAccess fa = new FileAccess();
		String input = fa.readSingleLineFromFile("C:\\tools\\workspace\\AdventOfCode2016\\bin\\Day1a.txt");
		int currDirectionX = 0;
		int currDirectionY = 1;
		int currPositionX = 0;
		int currPositionY = 0;
		List<Pair> positions = new ArrayList<Pair>();
		String[] directions = input.split(",");
		for (String s : directions) {
			s = s.trim();
			if (currDirectionX == 0 && currDirectionY == 1) {
				if (s.startsWith("R")) {
					currDirectionX = 1;
					currDirectionY = 0;
				}
				if (s.startsWith("L")) {
					currDirectionX = -1;
					currDirectionY = 0;
				}
			} else if (currDirectionX == 1 && currDirectionY == 0) {
				if (s.startsWith("R")) {
					currDirectionX = 0;
					currDirectionY = -1;
				}
				if (s.startsWith("L")) {
					currDirectionX = 0;
					currDirectionY = 1;
				}
			} else if (currDirectionX == 0 && currDirectionY == -1) {
				if (s.startsWith("R")) {
					currDirectionX = -1;
					currDirectionY = 0;
				}
				if (s.startsWith("L")) {
					currDirectionX = 1;
					currDirectionY = 0;
				}
			} else {
				if (s.startsWith("R")) {
					currDirectionX = 0;
					currDirectionY = 1;
				}
				if (s.startsWith("L")) {
					currDirectionX = 0;
					currDirectionY = -1;
				}
			}
			int movementX = currDirectionX * Integer.parseInt(s.substring(1));
			int movementY = currDirectionY * Integer.parseInt(s.substring(1));
			if (movementX != 0) {
				for (int i = 1; i < Math.abs(movementX); i++) {
					if (movementX > 0) {
						Pair p = new Pair(currPositionX + i, currPositionY);
						if (positions.contains(p)) {
							System.out.println("Overlap at: " + p.getX() + "," + p.getY());
						} else {
							positions.add(p);
						}
					} else {
						Pair p = new Pair(currPositionX - i, currPositionY);
						if (positions.contains(p)) {
							System.out.println("Overlap at: " + p.getX() + "," + p.getY());
						} else {
							positions.add(p);
						}
					}
				}
			} else if (movementY != 0) {
				for (int i = 1; i < Math.abs(movementY); i++) {
					if (movementY > 0) {
						Pair p = new Pair(currPositionX, currPositionY + i);
						if (positions.contains(p)) {
							System.out.println("Overlap at: " + p.getX() + "," + p.getY());
						} else {
							positions.add(p);
						}
					} else {
						Pair p = new Pair(currPositionX, currPositionY - i);
						if (positions.contains(p)) {
							System.out.println("Overlap at: " + p.getX() + "," + p.getY());
						} else {
							positions.add(p);
						}
					}

				}
			}
			currPositionX += (currDirectionX * Integer.parseInt(s.substring(1)));
			currPositionY += (currDirectionY * Integer.parseInt(s.substring(1)));
			Pair currpos = new Pair(currPositionX, currPositionY);
			if (positions.contains(currpos)) {
				System.out.println("Found the overlapping position at: " + currPositionX + " " + currPositionY);
			} else {
				positions.add(currpos);
			}
		}
		System.out.println("Current Position: " + currPositionX + " " + currPositionY);

	}

}
