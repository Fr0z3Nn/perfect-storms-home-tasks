package ru.svivanov.module01.TASK_07;

import java.util.Arrays;
import java.util.Scanner;

public class Task_06 {
    //TODO Enter an integer and determine if the entry contains duplicate numbers.
    // Print "Yes" to the console, if any. Otherwise "No".
    public static void main(String[] args) {
        boolean duplicate = false;
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        char[] numbersInChar = numbers.toCharArray();

        for (int i = 0; i < numbersInChar.length; i++) {
            char numberToRemove = numbersInChar[i];
            numbersInChar[i] = 'N';
            if (ArrayContains(numberToRemove, numbersInChar)) {
                duplicate = true;
                break;
            }
        }
        System.out.println(duplicate ? "YES" : "NO");


    }



    private static boolean ArrayContains(char symbol, char[] array){
        for(char arrayChar : array){
            if(symbol == arrayChar){
                return true;
            }
        }
        return false;
    }
}
