package ru.it.academia.org.lesson2;

import static ru.it.academia.org.lesson2.CarService.totalPrice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "Vesta", Color.WHITE, true);
        car.setSeatPlace(5);
        car.setPrice(10000L);
        car.setEngineCapacity(2.0);


        car.setModel("Largus");

//        System.out.println(car);

        Color color = car.getColor();
//        System.out.println(color);

        long totalPrice = totalPrice(car, 3000);


//        System.out.println(totalPrice);


//        Car car2 = new Car();
//        System.out.println(car2);

        String s = color + "string";
        System.out.println(s);

        someMethod("WORLD");

    }


    public static String someMethod(String word) {
        String localString;
        int localInt;

        if (word == null) {
            localString = "word is null";
        } else {
            localString = "word is: " + word;
        }


        System.out.println(localString);

        return word;
    }

    public static String someMethod(String word, Integer price) {
        return word;
    }

}
