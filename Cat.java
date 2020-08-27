package ru.geekbrains_java_2;

public class Cat implements Participant, Jumpable, Runable {
    @Override
    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
