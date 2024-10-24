package com.example.FileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test1 {
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
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> h =new HashSet<>();
		for(String s : p) {
			String type = s.split(",")[1];
			h.add(type);
		}
		System.out.println("unique Type :"+h);
		System.out.println("Enter the Pokemon Type : ");
		String t = sc.nextLine();
		if(!(h.contains(t))) {
			System.out.println("Invalid Type.");
		}
		for(String s:p) {
			String ty = s.split(",")[1];
			if(ty.equalsIgnoreCase(t)) {
				System.out.println(s);
			}
		}
		
		  HashMap<String, Integer> typeCountMap = new HashMap<>();
	        for (String s : p) {
	            String type = s.split(",")[1].trim();
	           
	                typeCountMap.put(type, typeCountMap.getOrDefault(type, 0) + 1);
	            }
		System.out.println("Count of Pokemon types : "+typeCountMap);
		
		br.close();
		fr.close();
	}
}
