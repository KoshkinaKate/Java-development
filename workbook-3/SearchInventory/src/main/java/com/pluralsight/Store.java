package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(1, "tie", 8 ));
        inventory.add(new Product(2, "skirt", 25 ));
        inventory.add(new Product(3, "polo", 30 ));
        inventory.add(new Product(4, "pants", 14 ));
        inventory.add(new Product(5, "shoes", 70 ));
// this method loads product objects into inventory
// and its details are not shown
        return inventory;
    }
}

