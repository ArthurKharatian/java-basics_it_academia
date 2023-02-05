package ru.it.academia.org.lesson3;

public class Main {

    public static void main(String[] args) {
//        String staticConstant = STATIC_CONSTANT;
//        System.out.println(staticConstant);

//        Singleton singleton = Singleton.getInstance();
//        System.out.println(singleton);


        Sun sun = Sun.getSun();
        sun.setSize(123);
        sun.setColor("white");


        Sun sun2 = Sun.getSun();
        sun2.setSize(777);
        sun2.setColor("Yellow");


        System.out.println(sun);
        System.out.println(sun2);


    }

}
