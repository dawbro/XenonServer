package org.x.server.xserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
	 public void run(){
		 try {
			
			ServerSocket mySS = new ServerSocket(9999);
			System.out.println("Server Online And Accepting Clients.");
			
			Socket SS_accept = mySS.accept();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(SS_accept.getInputStream()));
			while(true){
			String s = br.readLine();
			System.out.println(s);
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 public void start(){
		 run();
	 }
}
