package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {
        // exercise #1 - find the highest salary
        float bobSalary= 79_000f;
        float garySalary= 77_500f;
        float highestSalary= Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is" +" "+ highestSalary);

        // exercise #2 - find the lowest vehicle price
        int carPrice = 37_895;
        int truckPrice = 65_271;
        int lowestVehiclePrice= Math.min(carPrice, truckPrice);

        System.out.println("The lowest vehicle price is "+ " "+ lowestVehiclePrice);

        // exercise #3 - find and display the area of a circle whose radius is 7.5
        double radius = 7.5;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle is %.3f%n", area); // /n to go to the next line and f means float


        // exercise #4 - find and display the square root a variable after it is set to 5.0
        double variable = 5;
        double squareRoot = Math.sqrt(variable);

        System.out.println("The square root of" +" "+ variable +" " + "is = " + squareRoot );

        // exercise #5 - find and display the distance between the points (5, 10) and (85, 50)
        int x1=5, y1=10;
        int x2=85, y2= 50;
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The distance between (" + x1 + ","+ y1 + ") " + "and (" + x2 + ","+ y2 + ") " + "is = " + distance);

        // exercise #6 - find and display the absolute (positive) value of a variable after it is set to -3.8
        double value = -3.8;
        double positiveValue = Math.abs(value);
        System.out.println( "The positive value of " + value + " is = " + " " + positiveValue);

        // exercise #7 - find and display a random number between 0 and 1
//        double numberOne = 0;
//        double numberTwo = 1;
        double randomNumber = Math.random();
        System.out.println("The random number between 0 and 1 is " + randomNumber);

    }

}
