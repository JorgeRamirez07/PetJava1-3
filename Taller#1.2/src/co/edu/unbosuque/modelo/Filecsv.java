package co.edu.unbosuque.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filecsv {
	public Filecsv() {
	String patch=  ("pets-citizens.csv");
	String line=("");
	try {
		BufferedReader br = new BufferedReader(new FileReader(patch));
		while((line= br.readLine()) !=null) {
		String [] values= line.split(",");
		System.out.println(line);
		
			
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} {
		
	}
	}
}
