package ru.svivanov.module01.TASK_06;

import java.util.Arrays;

public class Task_04 {
    //TODO Implement a method that swaps the elements of the passed array from Task 3.
    // Handle cases of invalid input array indices.
    public static void main(String[] args) {
            int[] array = {1, 2, 3};
            swap(array, 1, 2);
            swap(array, 1, 3);
            swap(array, -1, 0);

            int[] array2 = new int[]{2, 4, 6, 8, 10};
            swap(array2, 2, 3);
            swap(array2, 4, 5);
            swap(array2, -2, 0);
        }


        private static void swap ( int[] array, int indexA, int indexB){
            int len = array.length -  1;
            System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);

            try{

                int temp = array[indexA];
                array[indexA] = array[indexB];
                array[indexB] = temp;
                System.out.println("Result: " + Arrays.toString(array) + "\n");

            }catch (ArrayIndexOutOfBoundsException e){

                if ((indexA > len || indexA < 0) && (indexB > len || indexB < 0)){
                    System.out.printf("IndexA (%d) and IndexB (%d) is incorrect \n", indexA, indexB);
                }else{
                    System.out.println(indexA > len || indexA < 0 ? "IndexA "+indexA+" is incorrect\n" : "IndexB "+indexB+" is incorrect\n");
                }
            }
        }
    }

