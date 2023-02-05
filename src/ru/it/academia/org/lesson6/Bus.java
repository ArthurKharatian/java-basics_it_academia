package ru.it.academia.org.lesson6;

public class Bus extends Transport implements SomeInterface {

    public Bus(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "SCANIA";
    }

    @Override
    void abstractMethod() {

    }

    @Override
    public void info() {
        System.out.println("info");
    }
}
