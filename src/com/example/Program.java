package com.example;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Hi! I am Pavani! Receptionist at Max Care");
        System.out.println("Who are you looking for?");
        System.out.println("Press 1. Physician\n2. Surgeon\n3. Dentist");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();  // Close the scanner after usage

        Doctor doc = null;
        switch (choice) {
            case 1:
                doc = new Physician();
                break;

            case 2:
                doc = new Surgeon();
                break;

            case 3:
                doc = new Dentist();
                break;

            default:
                System.out.println("Uh oh! Invalid Choice.");
                System.exit(0);
        }

        // If choice is valid, treat the patient
        doc.treatPatient();
    }
}

abstract class Doctor {
    abstract void treatPatient();
}

class Physician extends Doctor {
    @Override
    void treatPatient() {
        System.out.println("Hi! I am a Physician. I treat patients using medicines.");
    }
}

class Surgeon extends Doctor {
    @Override
    void treatPatient() {
        System.out.println("Hi! I am a Surgeon. I treat patients using surgeries.");
    }
}

class Dentist extends Doctor {
    @Override
    void treatPatient() {
        System.out.println("Hi! I am a Dentist. I treat patients' teeth.");
    }
}
