package ru.svivanov.module01.FINAL_TASK;

import ru.svivanov.module01.FINAL_TASK.menu.Structure;
import java.util.Scanner;
import ru.svivanov.module01.FINAL_TASK.menu.UserChoice;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //output to display instruction when you first log in
        Structure.instruction();


        while (true){
            //main menu
            Structure.showMenu();
            //checking user input
            if(scanner.hasNextInt()){
                int num = scanner.nextInt();
                // menu have only [1-7]
                if(num > 0 && num < 8){
                    UserChoice.choice(num);
                }else{
                    System.out.println("Enter the correct number in the range from 1 to 7");
                }
            }else{
                System.out.println("Enter a number. Your data is not a number");
                scanner.nextLine();
            }

        }
    }
}
