package com.example.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		
		System.out.println("Entere how many products ? ");
		int count = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=count;i++) {
			System.out.println("Enter Product title : ");
			String s =sc.nextLine();
			list.add(s);
		}
		
		try {
			FileWriter w = new FileWriter("C:\\Users\\dogga.durga\\Documents\\finbank\\Java8\\Encapusulation\\cart.txt");
			w.write("Shopping Cart :\n");
			for(String p :list) {
				w.write(p+"\n");
			}
			w.close();
			System.out.println("Products saved succesfully!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured while saving products..");
			e.printStackTrace();
		}
		sc.close();
		
	}

}
