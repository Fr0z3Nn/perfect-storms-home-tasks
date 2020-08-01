package ru.svivanov.module01.FINAL_TASK.menu;

import java.util.Scanner;

public class UserChoice {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Method allows you to select continue or end and exit to the main menu.
     * @param firstPoint - String: the first menu item
     * Example: Mokko
     * Console output: 1. Mokko
     * @param deepChoice - int: the case number / menu item
     */
    private static void continueOrGoBackToTheMainMenu(String firstPoint, int deepChoice){
        while (true){
            System.out.println(
                    "1. "+firstPoint+"\n" +
                            "2. Back to the main menu.");
            // check user input value
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

    /**
     * Method that helps you navigate through the main menu
     * @param num - int: the case number / menu item
     */
    public static void choice(int num){
        //respone its return value which shows the success of the method execution
        boolean response;
        switch (num){
            //ADD
            case 1:
                System.out.println("Write the name of the movie to add and press Enter");
                response = Movie.add(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was added successfully" : "This movie is already in the list");
                continueOrGoBackToTheMainMenu("Add one more movie name.", 1);
                break;
            //REMOVE
            case 2:
                System.out.println("Write the name of the movie to remove and press Enter");
                response = Movie.remove(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was removed successfully" : "This movie is not in the list");
                continueOrGoBackToTheMainMenu("Remove one more movie name.", 2);
                break;
            //EDIT
            case 3:
                System.out.println("Write the name of the movie to edit and press Enter");
                response = Movie.edit(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie was edited successfully" : "This movie is not in the list");
                continueOrGoBackToTheMainMenu("Edit one more movie name.", 3);
                break;
            //PRINT
            case 4:
                Movie.print();
                System.out.println("Press Enter to return back");
                scanner.nextLine();
                break;
            //CHECK
            case 5:
                System.out.println("Write the name of the movie to check it in MOVIE LIST");
                response = Movie.check(scanner.nextLine().toLowerCase().getBytes());
                System.out.println(response ? "The movie is in MOVIE LIST" : "The movie is NOT in MOVIE LIST");
                System.out.println("Press Enter to return back");
                scanner.nextLine();
                break;
            //SORT
            case 6:
                Movie.sort();
                System.out.println("Sorting was successful\n" +
                        "Press Enter to return back");
                scanner.nextLine();
                break;
            //EXIT
            case 7:
                System.exit(0);
        }
    }
}
