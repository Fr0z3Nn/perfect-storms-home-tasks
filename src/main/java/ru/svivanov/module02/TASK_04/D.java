package ru.svivanov.module02.TASK_04;

class D {
    int x = 10;
    int a = 5;
    int b = 6;
    int c = 4;

    public double average() {
        if (x > 0) {
            double avg = 0;
            avg = (double) (a + b + c) / 3;
            return avg;
        } else {
            int avg = 0;
            return avg;
        }

    }
}

class Test{
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.average());
    }
}