package ru.svivanov.module01.TASK_04;

public class Logical {
    public static void main(String[] args) {
        //TODO Create boolean variables bOne and bTwo. Set the values, bOne is true, bTwo is false.
        // Display the result of all logical operations on the screen.
        //&& || ! ^
        //& | ! ^
        //Change bTwo to true. Display the result again. What type do logical operators return?
        // What is the difference between the logical operator NOT (!) And the rest?
        // What's the difference between shorthand and regular boolean operators?
        // (Write in the comments) Is the following example valid? If so, what would be the result:
        //a. true || false
        //b. false && true
        //c. !true || 1 >= 0
        //d. false && 5
        //e. true &&! false
        //f. true ^! true
        //i. 1> = 1 || false
        //g. true && 5 - 5
        boolean bOne = true;
        boolean bTwo = false;
        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(!bTwo);
        System.out.println(!bOne);
        System.out.println(bOne^bTwo);
        bTwo = true;
        System.out.println();
        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(!bTwo);
        System.out.println(!bOne);
        System.out.println(bOne^bTwo);

        //What type do logical operators return? Boolean
        // What is the difference between the logical operator NOT (!) And the rest? Need one variable
        // What's the difference between shorthand and regular boolean operators?
        // shorthand - bit operation

        //a. true || false     -> true
        //b. false && true     -> false
        //c. !true || 1 >= 0   -> true
        //d. false && 5        -> exception
        //e. true &&! false    -> true
        //f. true ^! true      -> true
        //i. 1> = 1 || false   -> true
        //g. true && 5 - 5     -> exception
    }
}
