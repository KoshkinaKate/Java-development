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
        Person person1 = new Person("Kate", "Koshkina", 28);
        Person person2 = new Person("John", "Doe", 35);
        Person person3 = new Person("Emma", "Smith", 42);
        Person person4 = new Person("Liam", "Johnson", 25);
        Person person5 = new Person("Olivia", "Brown", 31);
        Person person6 = new Person("Noah", "Williams", 29);
        Person person7 = new Person("Ava", "Jones", 33);
        Person person8 = new Person("Ethan", "Garcia", 27);
        Person person9 = new Person("Sophia", "Martinez", 30);
        Person person10 = new Person("Mason", "Rodriguez", 36);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);


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
//        myScanner.close();
        return people;

    }

    public static double averageAgeOfPeople(List<Person> people){
        double totalAge = 0;
        for (Person person : people) {
           totalAge += person.getAge();
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

