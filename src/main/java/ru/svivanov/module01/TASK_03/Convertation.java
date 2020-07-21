package ru.svivanov.module01.TASK_03;

public class Convertation {
    //TODO Convert the decimal number 123 to a number system: binary, octal, hexadecimal.
    public static void main(String[] args) {
        int i = 123;
        System.out.println("int i123 = 0b"+Integer.toBinaryString(i));
        System.out.println("int i123 = 0"+Integer.toOctalString(i));
        System.out.println("int i123 = 0x"+Integer.toHexString(i));
    }
}
