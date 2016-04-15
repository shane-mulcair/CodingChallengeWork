package com.shanemulcair.dailyprogrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.shanemulcair.utilities.FileAccess;

public class Challenge1Easy {
	
	public static void getDetails(){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name="";
	String age="";
	String username="";
	try {
		System.out.println("Hi, please give your name, age and username");
		name=br.readLine();
		age=br.readLine();
		username=br.readLine();
		List<String> inputs=new ArrayList<String>();
		inputs.add(name);
		inputs.add(age);
		inputs.add(username);
		FileAccess fa=new FileAccess();
		fa.writeToFile("C:\\tools\\inout\\c1easy.txt", inputs);
	} catch (IOException e) {
		System.out.println("Hang on, what the hell did you enter??");
		e.printStackTrace();
	}
	System.out.println("Your name is "+name+", your age is "+age+" and your username is "+username);
	}
}
