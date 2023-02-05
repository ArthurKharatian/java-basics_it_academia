package ru.it.academia.org.lesson6;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }

        Object object = new Object();


        Parent parent = new Parent();
        Parent child = new Child();
        Parent anotherChild = new AnotherChild();

//        parent.print();
//        child.print();
//        anotherChild.print();

//        Child child = new Parent();          // <- создание невозможно
//        Child child2 = new AnotherChild();

//
//        ((Child)parent).print(); // <- исключение ClassCastException
//
//        printInfo(parent);
//        printInfo(child);
//        printInfo(anotherChild);

//        Moveable scania = new Bus();
//        Moveable lada = new Car();
//
//        printInfo(scania);
//        printInfo(lada);

        Transport bus = new Bus(4000, 30, false);
        Transport plane = new Plane(14000, 300, true);

        printInfo(bus);
        printInfo(plane);

//        Transport transport = new Transport();  // <- создание невозможно

    }

    public static void printInfo(Parent parent) {
        parent.print();
    }


    public static void printInfo(Moveable moveable) {
        moveable.printTransportInfo();
    }

    public static void printInfo(Transport transport) {
        transport.printTransportInfo();
    }

}
