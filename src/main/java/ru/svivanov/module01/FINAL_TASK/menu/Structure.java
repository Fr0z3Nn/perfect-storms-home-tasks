package ru.svivanov.module01.FINAL_TASK.menu;

import java.util.Scanner;

public class Structure {
    public static void instruction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE MOVIE LIST PROGRAM.\n" +
                "Instruction manual:\n" +
                "1. Navigate through the menu items by entering numbers [1-7].\n" +
                "2. This program can store up to 100 movies.\n" +
                "\n" +
                "PRESS ENTER to continue...");
        scanner.nextLine();
    }
    public static void showMenu(){
        String[] menuItemForShow = {
                "       ACTION LIST",
                "1. Add a movie name.",
                "2. Remove the name of the movie.",
                "3. Edit the name of the movie.",
                "4. Show a list of all movies",
                "5. Check if the movie is in the database.",
                "6. Sorting movies by title",
                "7. Exit the program"
        };

        for(String item: menuItemForShow){
            System.out.println(item);
        }
    }
}
