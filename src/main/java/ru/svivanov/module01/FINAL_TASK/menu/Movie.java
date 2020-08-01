package ru.svivanov.module01.FINAL_TASK.menu;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    //DATABASE
    public static byte[][] MovieList = new byte[100][1000];
    //Create empty row for next checking with movie list
    private static final byte[] EmptyList = new byte[1000];

    /**
     * Method for adding a movie to the list
     * @param movie - byte[]: movie for add
     * @return - response:
     * true - successfully added
     * false - movie in list
     */
    public static boolean add(byte[] movie){
        //check in list
        if(check(movie)){
            return false;
        }
        //find empty row
        for (int i=0; i < MovieList.length; i++){
            if (Arrays.equals(MovieList[i],EmptyList)){
                MovieList[i] = movie;
                break;
            }
        }return true;
    }

    /**
     * Method for remove a movie from the list
     * @param movie - byte[]: movie for remove
     * @return - response:
     * true - successfully removed
     * false - movie isn't in list
     */
    public static boolean remove(byte[] movie){
        //check in list
        if(!check(movie)){
            return false;
        }
        //find movie and set in row EmptyList
        for (int i=0; i < MovieList.length; i++){
            if (Arrays.equals(MovieList[i],movie)){
                MovieList[i] = EmptyList;
                break;
            }
        }return true;
    }
    /**
     * Method to edit a movie from in list
     * @param movie - byte[]: movie for edit
     * @return - response:
     * true - successfully edited
     * false - movie isn't in list
     */
    public static boolean edit(byte[] movie){
        if(!check(movie)){
            return false;
        }
        System.out.println("Write new name of the movie");
        Scanner scanner = new Scanner(System.in);
        byte[] newMovieTitle = scanner.nextLine().toLowerCase().getBytes();
        remove(movie);
        add(newMovieTitle);
        return true;
    }

    /**
     * Method to print all movies
     */
    public static void print(){
        System.out.println("LIST OF MOVIES:");
        for (byte[] bytes : MovieList) {
            if (!Arrays.equals(bytes, EmptyList)) {
                System.out.println(new String(bytes));
            }
        }
    }

    /**
     * Method to check a movie in list
     * @param movie - byte[]: movie to check
     * @return - response:
     * true - movie in list
     * false - movie isn't in list
     */
    public static boolean check(byte[] movie){
        boolean isListContainMovie = false;
        for (byte[] bytes : MovieList) {
            if (Arrays.equals(bytes, movie)) {
                isListContainMovie = true;
            }
        } return isListContainMovie;
    }

    /**
     * Method to sort list in alphabetical order
     */
    public static void sort(){

        for(int t = 0; t < MovieList.length - 1; t++){
            //range 0-99 [in program    i / 0 - 99 :                j + 1 / 0 - 98]
            for(int i=0,j=0; i != MovieList.length - 1 && j != MovieList.length - 2;){
                // find first not empty row
                if(Arrays.equals(MovieList[i],EmptyList)){
                    i++;
                    continue;
                }
                // find second not empty row
                if(Arrays.equals(MovieList[j+1],EmptyList)){
                    j++;
                    continue;
                }
                //Math.min - length may be different find minimal
                    for (int k = 0; k<Math.min(MovieList[i].length,MovieList[j+1].length);k++){
                        // item in row ... bubble sorting
                        if(MovieList[i][k] > MovieList[j+1][k]){
                            byte[] temp = MovieList[i];
                            MovieList[i] = MovieList[j+1];
                            MovieList[j+1] = temp;
                            break;
                        }
                        //item in row ... try find first not equals
                        if (MovieList[i][k] == MovieList[j+1][k]){
                            continue;
                        }
                        //item in row ... exit because we must find only >
                        if(MovieList[i][k] < MovieList[j+1][k]){
                            break;
                        }
                }
                    // increment to find next pair of not empty values
                i++;
                j++;
            }
        }
    }
}




