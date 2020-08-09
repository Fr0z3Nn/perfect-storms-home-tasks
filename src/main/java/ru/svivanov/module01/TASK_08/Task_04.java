package ru.svivanov.module01.TASK_08;

public class Task_04 {
    public static void main(String[] args) {
        //TODO Write a method that takes an integer parameter and displays numbers from 0 to the parameter. Use recursion. Call it in the main method.

        recursionPrint(5);
        for(int i =0;i<10;i++){
            System.out.println(fib(i));
        }

    }
    // 0 1 1 2 3 5 8 13
    private static long fib(int index){
        if (index == 0){
            return 0;
        }else if(index == 1){
            return 1;
        }else{
            return fib(index-1)+ fib(index-2);
        }


    }
    private static void recursionPrint(int num) {
        if (num < 0) {
            return;
        }
        System.out.println(num);
        recursionPrint(num - 1);
    }

}
