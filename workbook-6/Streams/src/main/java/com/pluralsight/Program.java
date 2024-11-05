package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = listOfPeople();

        double averageAge = averageAgeOfPeople(people);
        System.out.println("Average age is: " + averageAge);

        double oldPerson = oldestPerson(people);
        System.out.println("The oldest person is: " + oldPerson);

        double youngPerson = youngestPerson(people);
        System.out.println("The youngest person is: " + youngPerson);

    }


    public static List<Person> listOfPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kate", "Koshkina", 28));
        people.add(new Person("Kot", "Koshk", 25));
        people.add(new Person("John", "Doe", 35));
        people.add(new Person("Emma", "Smith", 42));
        people.add(new Person("Liam", "Johnson", 25));
        people.add(new Person("Olivia", "Brown", 31));
        people.add(new Person("Noah", "Williams", 29));
        people.add(new Person("Ava", "Jones", 33));
        people.add(new Person("Ethan", "Garcia", 27));
        people.add(new Person("Sophia", "Martinez", 30));
        people.add(new Person("Mason", "Rodriguez", 36));

        System.out.println("Search a person by first or last name");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter first or last name: ");
        String name = myScanner.nextLine();
        boolean found = false;
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(name) || person.getLastName().equalsIgnoreCase(name)) {
                System.out.println("Found in the system: " + person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No person was found, try again");
        }
        return people;

    }

    public static double averageAgeOfPeople(List<Person> people){
        double totalAge = 0;
        for (Person person : people) {
           totalAge += person.getAge(); //total age
        }
        return totalAge/ people.size();
    }

    public static double oldestPerson(List<Person> people){
        double oldest = people.get(0).getAge(); //starts with 1st person if it passes > it goes to next
        for (Person person : people) {
            if( person.getAge() > oldest ){
                oldest = person.getAge();
            }
        }
        return oldest;
    }
    public static double youngestPerson(List<Person> people){
        double youngest = people.get(0).getAge(); //starts with 1st person if it passes > it goes to next
        for (Person person : people) {
            if( person.getAge() < youngest ){
                youngest = person.getAge();
            }
        }
        return youngest;
    }

}

