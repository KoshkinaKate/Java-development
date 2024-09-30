package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name = getName(myScanner); //calling getName in order to input name , step 2 from line 28
        int age = getAge(myScanner);
        printInfo(name,age);
        printVotingEligibility(age);
        printMessage(name,age); // any outside method must be called in main method to run
        printWelcomeMessage(name);
        checkingNameAndAge(name,age);
        double number = getNumber(myScanner);

        double squareRoot= calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        int firstNumber = getFirstNumber(myScanner);
        int secondNumber = getSecondNumber(myScanner);
        boolean isGreaterThan = isGreaterThan(firstNumber,secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + ":" + isGreaterThan);

        String welcomeMessage =  name.equals("Eve") ? "You are not welcome, " + name + " !" : "Welcome, " + name + "!";
        System.out.println(welcomeMessage);   // ? is true (if) // : - else

        int maxNumber = biggerNumber(firstNumber,secondNumber);
        System.out.println(" The bigger number is " + maxNumber);

        int randomNum = generateRandomNumber();
        System.out.println("Random number between 1 and 10: " + randomNum);

        int minNumber = smallerNumber(firstNumber,secondNumber);
        System.out.println(" The smaller number is " + minNumber);

    }

    public static void printVotingEligibility (int age){
        if ( age >= 18){
            System.out.println(" You can vote");
        }else{
            System.out.println(" You can not vote");
        }
    }

    public static void printInfo (String name, int age){
        System.out.println("Name " + name);
        System.out.println("Age "+ age);
    }

    public static String getName (Scanner myScanner){
        System.out.println("Please enter your name"); // step 1
        return myScanner.nextLine();

    }

    public static int getAge (Scanner myScanner){
        System.out.println("Please enter your age: ");
        return myScanner.nextInt();
    }

    public static void printMessage (String name, int age){
        System.out.println("Hello, " + name+ "! You are " + age + "years old");

    }

//    public static void checkingName (String name){
//        if (name.equalsIgnoreCase("Alice")){
//            System.out.println("Welcome, Alice");
//        }else{
//            System.out.println("Hello stranger");
//        }
//    }
    public static void printWelcomeMessage( String name){
        switch (name.toLowerCase()){
            case "alice" :
                System.out.println("Welcome, Alice");
                break;
            case "bob":
                System.out.println("Hey Bob, lets grab a drink");
                break;
            default: //if none of the conditions is true
                System.out.println("Hello, stranger");
                break;
        }
    }

    public static void checkingNameAndAge (String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("You are old enough to drink");
        } else {
            System.out.println("Sorry, you are too young!");
        }
    }
    public static double getNumber(Scanner myScanner){
        System.out.println("Please enter the number: ");
        return myScanner.nextDouble();
    }

    public static double calculateSquareRoot (double number){
        return Math.sqrt(number);
    }

    public static int getFirstNumber(Scanner myScanner){
        System.out.println("Enter first number: ");
        return myScanner.nextInt();
    }

    public static int getSecondNumber(Scanner myScanner){
        System.out.println("Enter second number: ");
        return myScanner.nextInt();
    }

    public static boolean isGreaterThan (int firstNumber, int secondNumber){
        return firstNumber > secondNumber;
    }

    public static int biggerNumber ( int firstNumber , int secondNumber){
        return Math.max(firstNumber,secondNumber); //comparing numbers that were input in previous method.
    }

    public static int generateRandomNumber(){
        return (int) (Math.random() * 10) + 1; // (int) (Math.random()* (max - min) + 1) + min;
    }

    public static int smallerNumber ( int firstNumber , int secondNumber){
        return Math.min(firstNumber,secondNumber); //comparing numbers that were input in previous method on line 106 and 111.
    }


}
