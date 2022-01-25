package edu.wctc;

import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Item stuff = new Item("Laptop", "HP");
        Clothing shirt = new Clothing("Shirt", "Under Armour", 2, "blue");

        //System.out.println(stuff);
        System.out.println(shirt);

        Item hat = new Clothing("Hat", "Spiderman", 5, "Red");
        Item folder = new SupplyItem("Folder", "red 2 pocket folder", "Grade 1");
        List<Item> backpack = new ArrayList<>();
        backpack.add(hat);
        backpack.add(folder);
        backpack.add(new SupplyItem("Notebook", "spiral", "Grade 1"));


        for (Item i : backpack) {
            System.out.println(i);
        }


    }

    static void groceryItemDemo() {
        GroceryItem item = new GroceryItem();
        GroceryItem item2 = new GroceryItem("Apples", 2);

        System.out.println(item2.getName());
        item.setName("Loaf");
        System.out.println(item.getName());
        item.setQuantity(1);
        System.out.println(item.getQuantity());

        List<GroceryItem> groceries = new ArrayList<>();
        groceries.add(item);
        groceries.add(item2);

        for (GroceryItem thing : groceries) {
            System.out.printf(thing.toString());
        }
    }

    static void review() {
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

}
