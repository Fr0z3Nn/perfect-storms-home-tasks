package ru.svivanov.module02.FINAL_TASK.logic;

import java.util.Arrays;

public class Logic {
    private final FigureLogic[] figures = new FigureLogic[32];
    private int index = 0;
    public void add(FigureLogic figure){
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest){
        boolean res = false;
        int index = this.findBy(source);
        if(index != -1){
            if(this.figures[index].way(source, dest)){
                res = true;
            }
        }
        return res;
    }

    private int findBy(Cell cell) {
        int res = -1;
        for (int index = 0; index != this.figures.length; index++){
           if(this.figures[index] != null && this.figures[index].position().equals(cell)){
               res = index;
               break;
           }
        }
        return res;
    }

    public void clean() {
        Arrays.fill(this.figures, null);
        this.index = 0;
    }

}
