package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("mod", "pink", 1,1,1,1,1);
        slowRide.setColor("Red");

        // Test the functionality of the classes and methods
        slowRide.ride();
//        semiTruck.loadCargo();
//        hoverCraft.hover();
//        car.openTrunk();

        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
//        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
//        System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
//        System.out.println("Top speed of the Car: " + car.getTopSpeed());
    }
}