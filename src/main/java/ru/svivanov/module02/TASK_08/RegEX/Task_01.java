package ru.svivanov.module02.TASK_08.RegEX;

public class Task_01 {
    public static void main(String[] args) {
        String str = "12 var3 34 2%^i 90";
        getAllNumbers(str);
    }
    public static void getAllNumbers(String str){
        String result = str.replaceAll("[\\D]", "");
        System.out.println(result);
    }
    public static void getAllWordWithNumbers(String str){

    }
}
