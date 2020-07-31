package ru.svivanov.module01.FINAL_TASK.menu;

import java.util.Arrays;

public class Movie {
    public static byte[][] MovieList = new byte[100][1000];

    private static final byte[] EmptyList = new byte[1000];

    public static void addMovie(byte[] movie){
        for (int i=0; i < MovieList.length; i++){
            if (Arrays.equals(MovieList[i],EmptyList)){
                MovieList[i] = movie;
                return;
            }
        }
    }

    public static void removeMovie(byte[] movie){
        for (int i=0; i < MovieList.length; i++){
            if (Arrays.equals(MovieList[i],movie)){
                MovieList[i] = EmptyList;
                return;
            }
        }
    }

    public static void printMovies(){
        for(int i=0; i < MovieList.length; i++){
            if (!Arrays.equals(MovieList[i],EmptyList)){
                System.out.println(Arrays.toString(MovieList[i]));
            }
        }
    }

    public static void checkMovie(byte[] movie){
        boolean isListContainMovie = false;
        for (int i=0; i < MovieList.length; i++){
            if (Arrays.equals(MovieList[i],movie)){
                isListContainMovie = true;
            }
        }
        System.out.println(isListContainMovie ? "Данный фильм есть в базе" : "Данного фильма нет в базе");
    }
}
