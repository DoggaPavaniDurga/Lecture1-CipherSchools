package com.example.FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\dogga.durga\\Documents\\finbank\\Java8\\Encapusulation\\myTestFile.txt");
		if(f.exists()) {
			System.out.println("Printing Details");
			System.out.println("---------------");
			System.out.println("File Name : "+f.getName());
			System.out.println("File Size : "+f.length());
			System.out.println("File Path : "+f.getAbsolutePath());
			System.out.println("is File Readable ?"+f.canRead());
			System.out.println("is File Writer ? "+f.canWrite());
			System.out.println("--------------------");
		}
		
		
		//creating Directory in java
		File f1 = new File("C:\\Users\\dogga.durga\\Documents\\finbank\\Java8\\Encapusulation\\avengers");
		f1.mkdir();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter directory path : ");
		String s = sc.nextLine();
		File d1 = new File(s);
		if(!d1.exists()) {
			if(d1.mkdirs()) {
				System.out.println("Directory created suscesfully!!");
			}else {
				System.out.println("Failed to create directory");
			}
		}else {
			System.out.println("Directory exists");
		}
		for(int i=1;i<=100;i++) {
			File file=new File(s+File.separator+i+".txt");
			try {
				if(file.createNewFile()) {
					System.out.println("File created succesfully. "+file.getName());
				}else {
					System.out.println("File already exists "+file.getName());
				}
			}
			catch(IOException e){
				System.out.println("An error occured while creating file "+file.getName());
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
