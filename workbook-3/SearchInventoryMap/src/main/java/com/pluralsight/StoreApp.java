package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
public class StoreApp {
    // the key is the product id, the value is a product object
    public static HashMap<Integer, Product> inventory =
            new HashMap<Integer, Product>();
    public static void main(String[] args) {
        
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);  // Product ID
                String name = parts[1];               // Product name
                double price = Double.parseDouble(parts[2]);  // Product price

                // Add the product to the inventory with id as the key
                inventory.put(id, new Product(id, name, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        loadInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }
}

