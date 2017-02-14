package com.reviewapplication.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddReviewService {
	
	public void sendReviewToPython(String movieName, String review)
	{
		try{
		Path currentRelativePath = Paths.get("");
		 String s = currentRelativePath.toAbsolutePath().toString(); 
		 System.out.println("Current relative path is: " + s);
		 String s2 = "D:/Tcs eclipse and java/eclipse-jee-mars-R-win32-x86_64/eclipse/";
		 String filePath = s2+ "test2.py";			 
		 String newPath = filePath.replace('\\', '/');
		 
		 System.out.println(newPath);
		ProcessBuilder   ps=new ProcessBuilder("python",newPath,movieName,review);


		ps.redirectErrorStream(true);

		Process pr = ps.start();  

		BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line;
		String data = "";
		while ((line = in.readLine()) != null) {
			
			
			data += line;
		}
		pr.waitFor();
		System.out.println(data);
		System.out.println("ok!");

		in.close();
		//System.exit(0);
	} 
	catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	}

	
}


