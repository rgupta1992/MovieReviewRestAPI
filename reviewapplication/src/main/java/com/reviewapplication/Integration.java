package com.reviewapplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.print.DocFlavor.URL;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Integration {

	public static void main(String args[]){
		
		try {
			 Path currentRelativePath = Paths.get("");
			 String s = currentRelativePath.toAbsolutePath().toString(); 
			 System.out.println("Current relative path is: " + s);
			
			 String filePath = s+ "\\test1.py";			 
			 String newPath = filePath.replace('\\', '/');
			 
			 System.out.println(newPath);
			ProcessBuilder   ps=new ProcessBuilder("python",newPath);


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
			System.exit(0);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}



