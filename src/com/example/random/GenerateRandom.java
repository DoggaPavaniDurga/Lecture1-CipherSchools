package com.example.random;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandom {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int computerChoice=random.nextInt(20);
		System.out.println("Computer Number: " + computerChoice);
	//for loop	
		for(int i=1;i<=6;i++) {
		System.out.println("Guess a Num bet 0 and 20: ");
		int userChoice=sc.nextInt();
		//if loop
		if(userChoice>computerChoice) {
			System.out.println("guess is high");
		}else if(userChoice<computerChoice) {
			System.out.println("guess is low");
		} else {
			System.out.println("gotcha! you guessed it right.");
			break;
		}
		}
	}
       
      
		
	

}
