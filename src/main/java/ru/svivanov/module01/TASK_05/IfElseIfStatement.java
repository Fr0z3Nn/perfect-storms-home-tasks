package ru.svivanov.module01.TASK_05;

import java.util.stream.IntStream;

public class IfElseIfStatement {
    private static void streamMinMax(int A, int B, int C){
        System.out.printf("MIN = %s\n", IntStream.of(A,B,C).min().getAsInt());
        System.out.printf("MAX = %s\n", IntStream.of(A,B,C).max().getAsInt());
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 2;
        int c = 78;
        //streamMinMax(a,b,c);
        if (a>b && a>c){

            if(b>c){
                System.out.printf("min_C= %d\n",c);
                System.out.printf("max_A= %d",a);
            }else{
                System.out.printf("min_B= %d\n",b);
                System.out.printf("max_A= %d",a);
            }

        }else if(c>b && c>a){

            if(b>a){
                System.out.printf("min_A= %d\n",a);
                System.out.printf("max_C= %d",c);
            }else{
                System.out.printf("min_B= %d\n",b);
                System.out.printf("max_C= %d",c);
            }

        }else{

            if(a>c){
                System.out.printf("min_C= %d\n",c);
                System.out.printf("max_B= %d",b);
            }else{
                System.out.printf("min_A= %d\n",a);
                System.out.printf("max_B= %d",b);
            }

        }


    }
}
