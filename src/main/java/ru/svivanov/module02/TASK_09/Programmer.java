package ru.svivanov.module02.TASK_09;

public class Programmer {
    private String name;
    private int age;
    Experience experience;

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("In the matrix there is a new programmer named " + name + ", he is " + age + " years old.");
        this.experience = new Experience();
    }

    public String analysis(Stack stack) {
        String res = "Threat level: ";
        int len = stack.skills.length;
        if (len == 0) {
            return res += "Is absent";
        } else if (len < 5) {
            return res += "Weak";
        } else if (len < 9) {
            return res += "Serious, establish surveillance!";
        } else if (len < 13) {
            return res += "Dangerous, send Smith to him!";
        } else {
            return res += "He is the chosen one...";
        }
    }

    //Experience class
    private class Experience {
        private int summary = (age - 20) / 2;

        public Experience() {
            System.out.println("Approximate work experience - " + summary + " years.");
        }
    }

    //Stack class
    public static class Stack {
        String[] skills;

        public Stack(String[] stack) {
            this.skills = stack;
        }

    }
}

class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Tomas", 32);
        Programmer.Stack stack = new Programmer.Stack(new String[]{"Java", "Spring", "Kotlin", "Postgresql", "Conspiracy theory"});

        System.out.println(programmer.analysis(stack));
    }
}

