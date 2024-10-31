package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    //methods
    public void jewelry (double karat ){
        System.out.println("here is the karat's size");
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
