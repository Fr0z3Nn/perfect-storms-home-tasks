package ru.svivanov.module01.TASK_04;

public class IncrementAndDecrement {
    //TODO Create variable a and b. Set the variable a to 0, b value 5. Then:
    //Using the increment operator, increase the variable a.
    //Using the decrement operator, decrease the variable b.
    //Display the variables on the screen.
    //Assign the following expression to variable a:
    //a = --b;
    //and display the variables on the screen.
    //Assign the following expression to variable a:
    // a = b--;
    //and display a and b on the screen. Write in the comments what happened, why?
    // Write what pre-increment and post-increment are, as well as pre-decrement and post-decrement.
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        System.out.println(++a);
        System.out.println(--b);
        a = --b;
        System.out.println(a);
        a = b--;
        System.out.println(a);
    }
    // post a = b--; a = b++; first: a = b then b++
    // pre a = --b; a = ++b;  first ++b then a = b
}
