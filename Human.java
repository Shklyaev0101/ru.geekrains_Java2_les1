package ru.geekbrains_java_2;

public class Human implements Participant, Jumpable, Runable {
    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }
}

