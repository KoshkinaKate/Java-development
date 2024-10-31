package com.pluralsight.finance;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, value);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    //methods

    public void House (int yearBuilt, int squareFeet, int bedrooms){
        System.out.println("Here is the house information");
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
