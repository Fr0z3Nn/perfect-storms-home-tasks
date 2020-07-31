package ru.svivanov.module01.FINAL_TASK.menu;

import java.util.Scanner;

public class UserChoice {
    public static void choice(int num){
        Scanner scanner = new Scanner(System.in);
        int deepChoice;
        boolean response;
        switch (num){

            case 1:
                System.out.println("Write the name of the movie to add and press Enter");
                response = Movie.add(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was added successfully" : "This movie is already in the list");
                System.out.println(
                        "1. Add one more movie name.\n" +
                        "2. Back to the main menu.");
                deepChoice = scanner.nextInt();
                if(deepChoice == 1){
                    choice(1);
                }
                break;

            case 2:
                System.out.println("Write the name of the movie to remove and press Enter");
                response = Movie.remove(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was removed successfully" : "This movie is not in the list");
                System.out.println(
                        "1. Remove one more movie name.\n" +
                        "2. Back to the main menu.");
                deepChoice = scanner.nextInt();
                if(deepChoice == 1){
                    choice(2);
                }
                break;

            case 3:
                System.out.println("Write the name of the movie to edit and press Enter");
                response = Movie.edit(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was edited successfully" : "This movie is not in the list");
                System.out.println(
                        "1. Edit one more movie name.\n" +
                        "2. Back to the main menu.");
                deepChoice = scanner.nextInt();
                if(deepChoice == 1){
                    choice(3);
                }
                break;

            case 4:
                Movie.print();
                System.out.println("Press Enter to return back");
                scanner.nextLine();

            case 5:
                System.out.println("Write the name of the movie to check it in MOVIE LIST");
                response = Movie.check(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie is in MOVIE LIST" : "The movie is NOT in MOVIE LIST");
                System.out.println("Press Enter to return back");
                scanner.nextLine();

            case 7:
                System.exit(0);
        }
    }
}
