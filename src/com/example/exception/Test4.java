package com.example.exception;

import java.io.File;
import java.io.IOException;

public class Test4 {
	public static void main(String[] args) throws IOException {
		File f =new File("d:\\abc.txt");
		f.createNewFile();
	}

}
