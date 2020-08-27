package ru.geekbrains_java_2;

public class Robot implements Participant, Jumpable, Runable {
    @Override
    public void jump() {
        System.out.println("Robot is jumping");
        }

    @Override
    public void run() {
        System.out.println("Robot is running");
    }
}
