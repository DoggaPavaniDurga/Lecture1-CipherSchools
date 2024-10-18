package com.example.random;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit Number: ");
		int randomNum=sc.nextInt();
		Random random = new Random();
        int randomNumber = random.nextInt(randomNum) ; 
        System.out.println("Random Number: " + randomNumber);
		
	}

}
