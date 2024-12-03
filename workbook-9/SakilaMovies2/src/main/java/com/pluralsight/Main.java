package com.pluralsight;

import com.pluralsight.db.DataManager;
import com.pluralsight.models.Actor;
import com.pluralsight.models.Film;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

        DataManager dataManager = new DataManager(dataSource);

        try (Scanner scanner = new Scanner(System.in)) {
            // Fetch actors by last name
            System.out.print("Enter the last name of an actor: ");
            String lastName = scanner.nextLine();
            List<Actor> actors = dataManager.getActorsByLastName(lastName);

            if (!actors.isEmpty()) {
                System.out.println("\nYour matches are:");
                for (Actor actor : actors) {
                    System.out.println(actor.getFirstName() + " " + actor.getLastName());
                }
            } else {
                System.out.println("\nNo matches!");
            }

            // Fetch films by actor
            System.out.print("\nEnter the first name of an actor: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter the last name of an actor: ");
            lastName = scanner.nextLine();
            List<Film> films = dataManager.getFilmsByActor(firstName, lastName);

            if (!films.isEmpty()) {
                System.out.println("\nThe films the actor has been in:");
                for (Film film : films) {
                    System.out.println(film.getTitle());
                }
            } else {
                System.out.println("\nNo films found for the actor!");
            }
        }
    }
}