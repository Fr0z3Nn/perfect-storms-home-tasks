package ru.svivanov.module01.FINAL_TASK;

import ru.svivanov.module01.FINAL_TASK.menu.Structure;
import java.util.Scanner;
import ru.svivanov.module01.FINAL_TASK.menu.UserChoice;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Structure.instruction();

        while (true){
            Structure.showMenu();
            UserChoice.choice(scanner.nextInt());
        }
    }
}
