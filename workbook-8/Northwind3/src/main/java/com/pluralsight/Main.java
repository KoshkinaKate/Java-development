package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("The application must have username and password to run");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        DBHelper dbHelper = new DBHelper(username, password);
        Menu menu = new Menu(dbHelper);

        menu.displayHomeScreen();
    }
}
