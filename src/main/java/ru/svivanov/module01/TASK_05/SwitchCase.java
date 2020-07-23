package ru.svivanov.module01.TASK_05;

import java.util.Scanner;

public class SwitchCase {
    //TODO Enter the number of month or any number from keyboard using Scanner (type int).
    //You need write a programme to determine the season of year (winter, spring, summer, autumn)
    // and display it on the console. Don't forget about default meaning.
    public static void main(String[] args) {
        System.out.println("Enter any number.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("error");
        }
    }
}
