package com.pluralsight;

public class CellPhone {
    private double serialNumber; //this name is also used at line 11 with this.
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0 ;
        this.model = " ";
        this.carrier = " ";
        this.phoneNumber = " ";
        this.owner = " ";
    }

    public double getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void dial( String number){
        System.out.println("\n" + owner + "'s phone is calling " + number);
    }
}