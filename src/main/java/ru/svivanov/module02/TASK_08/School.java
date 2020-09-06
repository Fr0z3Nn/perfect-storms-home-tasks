package ru.svivanov.module02.TASK_08;

import ru.svivanov.module02.TASK_08.support.People;
import ru.svivanov.module02.TASK_08.support.Pupil;

public class School {
    int numberOfCabinet;
    People[] teachers;
    Pupil[] pupils;

    public School(int numberOfCabinet, People[] teachers, Pupil[] pupils) {
        this.numberOfCabinet = numberOfCabinet;
        this.teachers = teachers;
        this.pupils = pupils;
    }

    public School(int numberOfCabinet, People[] teachers) {
        this.numberOfCabinet = numberOfCabinet;
        this.teachers = teachers;
    }

    public School(int numberOfCabinet) {
        this.numberOfCabinet = numberOfCabinet;
    }
}
