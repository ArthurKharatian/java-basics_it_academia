package ru.it.academia.org.lesson7;

public class Main {

    public static void main(String[] args) {
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(); <- нет доступа снаружи
//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.methodNestedStaticClass();

        Some some = new Some() {
            @Override
            public void print() {
                System.out.println(name());
            }

            @Override
            public String name() {
                return "John";
            }
        };

        some.print();
    }

    public void some() {
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
    }

}
