package com;
//super

class App {
    App() {
        System.out.println("Constructor of App");
    }

    App(int sum) {
        System.out.println("Sum: " + sum);
    }
}

public class Test extends App {
    Test() {
        super(20); 
        System.out.println("Constructor of Test");
    }

    public static void main(String[] args) {
        new Test();
    }
}
