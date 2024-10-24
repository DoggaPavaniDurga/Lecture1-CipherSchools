package com.example.FileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Test0 {
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:\\Users\\dogga.durga\\Documents\\finbank\\Java8\\Encapusulation\\myTestFile.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		ArrayList<String> p = new ArrayList<>();
		//br.readLine();
		while ((line = br.readLine())!=null) {
			//System.out.println(line);
			p.add(line);
		}
		System.out.println("Total Pokemons: "+p.size());
		
		
		ArrayList<String> pTitle = new ArrayList<>();
		for(String po :p) {
			String t=po.split(",")[0];
			pTitle.add(t);
		}
		
		System.out.println("Pokeman Names :"+pTitle);
		
		
		
		HashSet<String> h =new HashSet<>();
		for(String s : p) {
			String type = s.split(",")[1];
			h.add(type);
		}
		System.out.println("unique Type :"+h);
		br.close();
		fr.close();
		
		
	
		
		
	}

}
