package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied; //might be false because it is initially not occupied
        this.isDirty = isDirty; //same here

    }
//Getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
    //Derived getter
    public boolean isAvailable(){
        return !isDirty && !isOccupied;
    }
    //Derived getter
    public String getDeterminePrice(){
        return "Rooms with" + numberOfBeds + "cost" + price;
    }
}
