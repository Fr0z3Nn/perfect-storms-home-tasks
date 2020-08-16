package ru.svivanov.module02.TASK_02;

public class Garbage {
        public static void main(String [] args)
        {
            Object a = new Integer(100);  // Line1
            Object b = new Long(100);     // Line2
            Object c = new String("100"); // Line3
            a = null;                     // Line4 a - null b - Long c - String
            a = c;                        // Line5 a - String b - Long c - String
            c = b;                        // Line6 a - String b - Long c - Long
            b = a;                        // Line7 a - String b - String c - Long
            // Rest of the code here
            // one line will be collected
        }

}
