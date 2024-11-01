package com.pluralsight;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    //methods

    @Override
    public double getValue() {
        return 0.0;
    }
}