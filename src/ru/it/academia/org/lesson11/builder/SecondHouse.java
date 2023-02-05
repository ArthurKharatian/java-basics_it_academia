package ru.it.academia.org.lesson11.builder;

public class SecondHouse extends Builder{

    public SecondHouse() {
        super.house = new House();
    }

    @Override
    public House buildHouse() {
        house.buildBase();
        house.buildWalls();
        house.buildFloors();
        return house;
    }
}
