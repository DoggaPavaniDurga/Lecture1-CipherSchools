package com.example.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\dogga.durga\\Documents\\finbank\\Java8\\Encapusulation\\myTestFile.txt",true);
		fw.write("I am Pavani\n");
		fw.write("i am the forest\n");
		fw.write("i am software developer\n");
		
		
		fw.write("Thanos is inEvitable\n");
		
		fw.flush();
		
		fw.close();
		
		System.out.println("Succesfully!!");
	}
}
