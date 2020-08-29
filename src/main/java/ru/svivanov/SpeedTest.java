package ru.svivanov;
// what is better?
// a = 0
// or
// if (a!= 0) a = 0
public class SpeedTest {
    public static void main(String[] args) {
        int[] test1 = create();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < test1.length; i++) {
            test1[i] = 0;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("первый вариант = " + (end1 - start1) + " ms");

        int[] test2 = create();
        long start = System.currentTimeMillis();
        for (int i = 0; i < test1.length; i++) {
            if (test2[i] != 0) {
                test2[i] = 0;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("первый вариант = " + (end - start) + " ms");
    }

    static int[] create() {
        int[] test1 = new int[100000000];
        for (int i = 0; i < 100000000; i++) {
            test1[i] = (int) (Math.random() * 5);
        }
        return test1;
    }

}
