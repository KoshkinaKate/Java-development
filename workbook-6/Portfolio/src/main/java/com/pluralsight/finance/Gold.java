package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double value) {
        super(name, value);
    }
    //methods
    public void Gold(double weight){
        System.out.println("here is the gold weight");
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
