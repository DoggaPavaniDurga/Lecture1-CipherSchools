package com.example.exception;

import java.io.File;
import java.io.IOException;

public class FileIOTest {
	public static void main(String[] args) {
		File f = new File("d:\\abc.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
