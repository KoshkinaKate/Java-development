package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        List<Person> matchingPeople = people
                .stream().filter(person-> person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName))
                .collect(Collectors.toList());


//        for (Person person : people) {
//            if (person.getFirstName().equalsIgnoreCase(searchName) ||
//                    person.getLastName().equalsIgnoreCase(searchName)) {
//                matchingPeople.add(person);
//            }
//        }

        System.out.println("People with matching name:");
        matchingPeople.stream()
                .map(person-> person.getFirstName() + " " + person.getLastName())
                .forEach(System.out::println);

//        for (Person person : matchingPeople) {
//            System.out.println(person.getFirstName() + " " + person.getLastName());
//        }

        double averageAge = calculateAverageAge(people);
//        people.forEach(System.out::println);
        System.out.println("Average age: " + averageAge);

        int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    private static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        // Add at least 10 people to the list
        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Jane", "Smith", 30));
        people.add(new Person("Michael", "Johnson", 35));
        people.add(new Person("Emily", "Brown", 22));
        people.add(new Person("David", "Miller", 40));
        people.add(new Person("Sarah", "Davis", 28));
        people.add(new Person("Daniel", "Anderson", 33));
        people.add(new Person("Jessica", "Wilson", 27));
        people.add(new Person("Matthew", "Martinez", 31));
        people.add(new Person("Olivia", "Taylor", 29));

        return people;
    }

    private static double calculateAverageAge(List<Person> people) {
        return people.stream()
                .mapToInt(person -> person.getAge()) //Person::getAge
                .average()
                .orElse(0.0); //when list is empty -ensures to return double 0.0
    }

//        int totalAge = 0;
//        for (Person person : people) {
//            totalAge += person.getAge();
//        }
//        return (double) totalAge / people.size();


    private static int findOldestAge(List<Person> people) {
        return people.stream()
                .mapToInt(person -> person.getAge())
                .max()
                .orElse(0);

//        int maxAge = Integer.MIN_VALUE;
//        for (Person person : people) {
//            if (person.getAge() > maxAge) {
//                maxAge = person.getAge();
//            }
//        }
//        return maxAge;
    }

    private static int findYoungestAge(List<Person> people) {
        return people.stream()
                .mapToInt(person -> person.getAge())
                .min()
                .orElse(0);
    }
//        int minAge = Integer.MAX_VALUE;
//        for (Person person : people) {
//            if (person.getAge() < minAge) {
//                minAge = person.getAge();
//            }
//        }
//        return minAge;
//    }
}