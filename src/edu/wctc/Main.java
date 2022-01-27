package edu.wctc;

import edu.wctc.game.Attack;
import edu.wctc.game.Character;
import edu.wctc.game.CheatingCharacter;
import edu.wctc.game.SwiftCharacter;

import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Character player1 = new SwiftCharacter("Mario");
        Character player2 = new CheatingCharacter("Bowser");

        player1.addAttack(new Attack("Punch", 15));
        player1.addAttack(new Attack("Kick", 15));
        player1.addAttack(new Attack("Fireball", 15));
        player1.addAttack(new Attack("Swat", 15));

        player2.addAttack(new Attack("Tail swipe", 20));
        player2.addAttack(new Attack("Fireball", 30));
        player2.addAttack(new Attack("Fall over", 0));

        playGame(player1,player2);

        if (player1.isAlive())
            System.out.println(player1.getName() + " wins");
        else if (player2.isAlive())
            System.out.println(player2.getName() + " wins");
        else
            System.out.println("It's a tie");
    }


    static void playGame(Character player1, Character player2) throws InterruptedException {
        while (player1.isAlive() && player2.isAlive()) {
            System.out.println(player1);
            System.out.println(player2);

            System.out.printf("\n%s %s", player1.getName(), player2.isAttacked(player1.dealsDamage()));
            doubleStrike(player1, player2);
            System.out.printf("\n%s %s", player2.getName(), player1.isAttacked(player2.dealsDamage()));
            doubleStrike(player2, player1);

            Thread.sleep(3);
        }
    }

    static void doubleStrike(Character attacking, Character defending) {
        if (attacking instanceof CheatingCharacter) {
            if (((CheatingCharacter) attacking).attemptCheat()) {
                System.out.printf("\n%s %s", attacking.getName(), defending.isAttacked(attacking.dealsDamage()));

            }
        }
        System.out.println();
    }

    static void Mod2Day1() {
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

            if (i instanceof SupplyItem)
                System.out.printf("Name: %s\nDesc: %s", i.getName(), i.getDesc());
            else
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
