package com.shanemulcair.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient {

	public static void main(String[] args) {

		String host="localhost";
		int port=19999;
		StringBuffer instr=new StringBuffer();
		String TimeStamp;
		System.out.println("Started the client");
		try{
			InetAddress addr=InetAddress.getByName(host);
			Socket conn=new Socket(addr,port);
			BufferedOutputStream bos=new BufferedOutputStream(conn.getOutputStream());
			OutputStreamWriter osw=new OutputStreamWriter(bos, "US-ASCII");
			TimeStamp=new java.util.Date().toString();
			String process = "Calling the Socket Server on "+ host + " port " + port +
			          " at " + TimeStamp +  (char) 13;
			osw.write(process);
			osw.flush();
			
			BufferedInputStream bis = new BufferedInputStream(conn.
			          getInputStream());
			InputStreamReader isr = new InputStreamReader(bis, "US-ASCII");
			int c;
		      while ( (c = isr.read()) != 13)
		        instr.append( (char) c);
			conn.close();
			System.out.println(instr);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			
		}
	}

}
