package ru.it.academia.org.lesson6;

public interface Moveable {

    public static final String BRAND = "BMW";

    public abstract void printTransportInfo();

    String transportName();

    default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {

    }

}
