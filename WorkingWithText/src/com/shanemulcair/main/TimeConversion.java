package com.shanemulcair.main;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        in.close();
        String time24="";
        if(time.endsWith("PM")){
            int hour=Integer.valueOf(time.substring(0, 2));
            if(hour==12){
            	time24=hour+time.substring(2,time.length()-2);
            }
            else{
            hour+=12;
            time24=hour+time.substring(2,time.length()-2);
            }
        }
        else{
        	int hour=Integer.valueOf(time.substring(0, 2));
        	if(hour==12){
        		hour=0;
        		time24="00"+time.substring(2, time.length()-2);
        	}
        	else if(hour<10){
        	time24="0"+hour+time.substring(2, time.length()-2);
        	}
        }
        System.out.println(time24);
    }

}
