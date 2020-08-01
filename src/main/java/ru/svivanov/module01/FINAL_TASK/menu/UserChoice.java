package ru.svivanov.module01.FINAL_TASK.menu;

import java.util.Scanner;

public class UserChoice {
    private static Scanner scanner = new Scanner(System.in);

    private static void continueOrGoBackToTheMainMenu(String firstPoint, int deepChoice){
        while (true){
            System.out.println(
                    "1. "+firstPoint+"\n" +
                            "2. Back to the main menu.");

            if(scanner.hasNextInt()){
                int continueOrBrake = scanner.nextInt();
                if (continueOrBrake == 1){
                    scanner.nextLine();
                    choice(deepChoice);
                    break;
                }
                if (continueOrBrake == 2){
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Enter the number [1] or press enter to exit");
        }

    }

    public static void choice(int num){
        int deepChoice;
        boolean response;
        switch (num){

            case 1:
                System.out.println("Write the name of the movie to add and press Enter");
                response = Movie.add(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was added successfully" : "This movie is already in the list");
                continueOrGoBackToTheMainMenu("Add one more movie name.", 1);
                break;




            case 2:
                System.out.println("Write the name of the movie to remove and press Enter");
                response = Movie.remove(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was removed successfully" : "This movie is not in the list");
                continueOrGoBackToTheMainMenu("Remove one more movie name.", 2);
                break;


            case 3:
                System.out.println("Write the name of the movie to edit and press Enter");
                response = Movie.edit(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was edited successfully" : "This movie is not in the list");
                continueOrGoBackToTheMainMenu("Edit one more movie name.", 3);
                break;


            case 4:
                Movie.print();
                System.out.println("Press Enter to return back");
                scanner.nextLine();
                break;

            case 5:
                System.out.println("Write the name of the movie to check it in MOVIE LIST");
                response = Movie.check(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie is in MOVIE LIST" : "The movie is NOT in MOVIE LIST");
                System.out.println("Press Enter to return back");
                scanner.nextLine();
                break;

            case 6:
                Movie.sort();
                System.out.println("Sorting was successful\n" +
                        "Press Enter to return back");
                scanner.nextLine();
                break;

            case 7:
                System.exit(0);
        }
    }
}
