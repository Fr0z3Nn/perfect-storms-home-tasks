package ru.svivanov.module01.FINAL_TASK.menu;

public class Structure {
    public static void showMenu(){
        String[] menuItemForShow = {
                "1. Add a movie name.",
                "2. Remove the name of the movie.",
                "3. Edit the name of the movie.",
                "4. Show a list of all movies",
                "5. Check if the movie is in the database.",
                "6. Sorting movies by title",
                "7. Exit the program"
        };

        for(String item: menuItemForShow){
            System.out.println(item);
        }
    }
}
