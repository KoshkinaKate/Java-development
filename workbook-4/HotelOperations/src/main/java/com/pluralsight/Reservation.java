package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        if (roomType.equalsIgnoreCase("king")){
            roomPrice = 139.00;
        }else if (roomType.equalsIgnoreCase("double")){
            roomPrice = 124.00;
        }
        if (isWeekend) {
            roomPrice *= 1.10;
        }
    }
    public double getReservationTotal (){
        return roomPrice * numberOfNights;
    }
}
