package ru.svivanov.module02.TASK_06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Apartment[] apartments = ApartmentUtil.getArrayOfRandomApartment();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose criteria:\n" +
                "1. Find a list of apartments with a given number of rooms\n" +
                "2. Find a list of apartments with a given number of rooms and located on a floor that is in a given interval\n"+
                "3. Find a list of apartments with an area exceeding the specified one");
        int chooseMenu = Integer.parseInt(scanner.nextLine());
        switch (chooseMenu){
            case 1:
                System.out.println("Input number of rooms:");
                int num = Integer.parseInt(scanner.nextLine());
                ApartmentUtil.findApartmentWithNumberOfRooms(apartments,num);
                break;
            case 2:
                System.out.println("Input number of rooms and floor interval:");
                String[] argsApart = scanner.nextLine().split(" ");
                ApartmentUtil.findApartmentWithNumberOfRoomsWithFloorInterval(apartments,Integer.parseInt(argsApart[0]),Integer.parseInt(argsApart[1]),Integer.parseInt(argsApart[2]));
                break;
            case 3:
                System.out.println("Input area of apartment:");
                int area = Integer.parseInt(scanner.nextLine());
                ApartmentUtil.findApartmentWithExceedArea(apartments,area);
                break;
        }
    }
}
