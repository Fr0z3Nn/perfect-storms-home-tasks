package ru.svivanov.module02.TASK_10;

import java.io.IOException;

public class Exceptions {
    class Quest1 {
        int counter;
        java.io.OutputStream out;

        Quest1() {/* инициализация out */}

        //IOException
        float inc() throws IOException {
            try {
                counter++;

                out.write(counter);
            } catch (Exception e) {

            }
            //return;
            return 2.3f;
        }
    }
}

class Quest2 {
    public int meth(int x) {
        int y = 010; //1
        try {
            y += x; //2
            if (x <= 5) throw new Exception(); //3
            y++;
        } //4
        catch (Exception e) {
            y--;
        } //5
        return y;
    } //6

    public static void main(String[] args) {
        Quest2 quest2 = new Quest2();
        System.out.println(quest2.meth(5));
    }
}

class Quest3 {
    int meth(int x) {
        int count = 0;
        try {
            count += x;
           // count += mexcept(count);
            count++;
        } catch (Exception e) {
            --count;
            return count;
        } finally {
            count += 3;
            return count;
        }
    }
}

class Base {
   // public void show(int i) {/realisation */}
}

class Quest4 extends Base {
//code
}
