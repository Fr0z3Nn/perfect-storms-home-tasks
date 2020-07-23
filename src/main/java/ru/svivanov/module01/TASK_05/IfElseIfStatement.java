package ru.svivanov.module01.TASK_05;

public class IfElseIfStatement {

    public static void main(String[] args) {
        int a = 32;
        int b = 2;
        int c = 78;
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
