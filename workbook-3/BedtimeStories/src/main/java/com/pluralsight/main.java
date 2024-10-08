package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a book you would like to read\n");

        try {
            FileInputStream goldilocksFile = new FileInputStream("goldilocks.txt");
            FileInputStream hanselFile = new FileInputStream( "hansel_and_gretel.txt");
            FileInputStream maryFile = new FileInputStream("mary_had_a_little_lamb.txt");

            Scanner goldilockScanner = new Scanner(goldilocksFile);
            Scanner hanselScanner = new Scanner(hanselFile);
            Scanner maryScanner = new Scanner(maryFile);

            String goldiLine;
            String hanselLine;
            String maryLine;

            while (goldilockScanner.hasNextLine()){
                goldiLine = goldilockScanner.nextLine();
                System.out.println(goldiLine);
            }
            while (hanselScanner.hasNextLine()){
                hanselLine = hanselScanner.nextLine();
                System.out.println(hanselLine);
            }
            while (maryScanner.hasNextLine()){
                maryLine = maryScanner.nextLine();
                System.out.println(maryLine);
            }
            goldilockScanner.close();
            hanselScanner.close();
            maryScanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

