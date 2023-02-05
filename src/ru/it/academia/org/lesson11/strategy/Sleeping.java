package ru.it.academia.org.lesson11.strategy;

public class Sleeping implements Activity{
    @Override
    public void work() {
        System.out.println("Sleeping...");
    }
}
