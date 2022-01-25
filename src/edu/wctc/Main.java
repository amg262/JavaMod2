package edu.wctc;

import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class Main {


    static void Review() {
        String[] groceries;
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter # of items");
        int num = Integer.parseInt(keyboard.nextLine());

        groceries = new String[num];

        getGroceries(groceries, keyboard);

        for (String item : groceries) System.out.println(item);

    }

    static void getGroceries(String[] groceries, Scanner keyboard) {

        for (int i = 0; i < groceries.length; i++) {
            System.out.printf("Grocery item #%d", (i + 1));
            groceries[i] = keyboard.nextLine();
        }

    }


    public static void main(String[] args) {
        // write your code here
        Review();
    }
}
