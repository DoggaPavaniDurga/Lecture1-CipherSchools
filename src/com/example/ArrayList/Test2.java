package com.example.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    String title;
    double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();
        double totalAmount = 0;
        String addMore;

        do {
            System.out.print("Enter product title: ");
            String title = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();  

            cart.add(new Product(title, price));
            totalAmount += price;

            System.out.print("Add more items? (y/n): ");
            addMore = scanner.nextLine();

        } while (addMore.equalsIgnoreCase("y"));

     
        Collections.sort(cart, Comparator.comparing(Product::getTitle));

        System.out.println("\nProduct list in ascending order:");
        for (Product product : cart) {
            System.out.println(product.getTitle() + " - " + product.getPrice());
        }

        System.out.println("\nTotal bill: " + totalAmount);
        
        scanner.close();
    }
}