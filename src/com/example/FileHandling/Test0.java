package com.example.FileHandling;

import java.io.File;
import java.io.IOException;

public class Test0 {
	public static void main(String[] args) {
		//Lab 1: creating empty files in java
		
		File f = new File("C:\\Users\\dogga.durga\\Documents\\finbank\\Java8\\Encapusulation\\cart.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File created Succesfully!!!");
	}
}
