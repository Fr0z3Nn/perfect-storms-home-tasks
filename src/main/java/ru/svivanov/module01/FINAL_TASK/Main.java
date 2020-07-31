package ru.svivanov.module01.FINAL_TASK;

import ru.svivanov.module01.FINAL_TASK.menu.Movie;
import ru.svivanov.module01.FINAL_TASK.menu.Structure;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Structure.showMenu();
        Movie.addMovie("2344".getBytes());
        Movie.printMovies();
        //Movie.removeMovie("2344".getBytes());
        Movie.printMovies();
    }
}
