package com.mycompany.dave;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class Parser {
	
	public void posTag(String fileName) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		
		String line = null; 
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("outputFile.txt")));
	}
	
	

	
}
