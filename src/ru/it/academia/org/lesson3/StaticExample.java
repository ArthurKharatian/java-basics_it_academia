package ru.it.academia.org.lesson3;

public class StaticExample {

    public static final String STATIC_CONSTANT = "some constant";
    private String string;
    public static String staticString;
    private final String nonStaticString;
    protected String protectedString;

    static {

        System.out.println("============");
        System.out.println("static block start");
        staticString = "static-String";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("============");

    }

    {
        System.out.println("============");
        System.out.println("non-static block start");
//        staticString = "12345";   <- здесь инициализация возможна!
        nonStaticString = "non-Static-String";
        System.out.println(nonStaticString);
        System.out.println("non-static block end");
        System.out.println("============");
    }

    public static void main(String[] args) {
//        StaticExample staticExample = null;
//        staticExample.print("12345");

//        System.out.println(Integer.parseInt("123"));

        Integer integer = null;
        int i = integer.parseInt("123"); // <- no NPE
        System.out.println(i);

    }


    public void print(String str) {
        System.out.println(str);
    }


    public void nonStaticMethod() {
        print("qwerty");
        staticMethod();
        //logic
    }


    public static void printStaticVar() {
        System.out.println(staticString + "in a static method");

        StaticExample staticExample = new StaticExample();
        staticExample.print(staticString);
    }

    public static void staticMethod() {
        printStaticVar();
        //logic
    }


    public static void someMethod(final int x, final int y) {
        int i = x + y;

    }

}
