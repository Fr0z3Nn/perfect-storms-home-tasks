package ru.svivanov.module01.FINAL_TASK.menu;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    public static byte[][] MovieList = new byte[100][1000];

    private static final byte[] EmptyList = new byte[1000];

    public static boolean add(byte[] movie){
        if(check(movie)){
            return false;
        }
        for (int i=0; i < MovieList.length; i++){
            if (Arrays.equals(MovieList[i],EmptyList)){
                MovieList[i] = movie;
                break;
            }
        }return true;
    }

    public static boolean remove(byte[] movie){
        if(!check(movie)){
            return false;
        }
        for (int i=0; i < MovieList.length; i++){
            if (Arrays.equals(MovieList[i],movie)){
                MovieList[i] = EmptyList;
                break;
            }
        }return true;
    }

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

    public static void print(){
        System.out.println("LIST OF MOVIES:");
        for (byte[] bytes : MovieList) {
            if (!Arrays.equals(bytes, EmptyList)) {
                System.out.print(Arrays.toString(bytes));
                System.out.println(new String(bytes));
            }
        }
    }

    public static boolean check(byte[] movie){
        boolean isListContainMovie = false;
        for (byte[] bytes : MovieList) {
            if (Arrays.equals(bytes, movie)) {
                isListContainMovie = true;
            }
        } return isListContainMovie;
    }

    public static void sort(){

        for(int t = 0; t < MovieList.length - 1; t++){
            for(int i=0,j=0;i!=MovieList.length - 1&&j!=MovieList.length - 2;){
                if(Arrays.equals(MovieList[i],EmptyList)){
                    i++;
                    continue;
                }
                if(Arrays.equals(MovieList[j+1],EmptyList)){
                    j++;
                    continue;
                }
                    for (int k = 0; k<Math.min(MovieList[i].length,MovieList[j+1].length);k++){
                        if(MovieList[i][k] > MovieList[j+1][k]){
                            byte[] temp = MovieList[i];
                            MovieList[i] = MovieList[j+1];
                            MovieList[j+1] = temp;
                            break;
                        }
                        if (MovieList[i][k] == MovieList[j+1][k]){
                            continue;
                        }
                        if(MovieList[i][k] < MovieList[j+1][k]){
                            break;
                        }
                }
                i++;
                j++;
            }
        }
    }
}




