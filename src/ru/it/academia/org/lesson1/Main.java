package ru.it.academia.org.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

//        byte a;

        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14.5d;

        char c = 'a';
        boolean isTrue = true;

//        System.out.println(c);

//        byte result = (byte) (b + i);
        int result = b + i;

//        System.out.println(result);

        long q = b + i;


//        double var = (double) i / 3;
//
//        System.out.println(var);

        String str = "Java";
        String string = new String("Java");
//        System.out.println(str);
//        System.out.println(string);


        if(true) {
            //logic
        }


        if (false) {
            //logic
        } else {
            //logic
        }

        if (false) {
            //logic
        } else if(true) {
            //logic
        } else if(true) {
            //logic
        } else if(true) {
            //logic
        } else {
            //logic
        }

        int x = 11;
        int y = 20;

        // x == y; x != y; x > y; x < y; x >= y; x <= y; x % 2 == 0;

//
//        if (x % 2 == 0) {
//            System.out.println("GOOD!");
//        }


//        if (x % 2 != 0 && x != y) {
//            System.out.println("OK!");
//        }

//        if (x % 2 == 0 || x != y) {
//            System.out.println("OK!");
//        }
//

//        int a = 3;
//
//        String res = a == 5 ? "Yes" : "No";
//
//        System.out.println(res);

//        String word = switcher(y);
//        print(word);


        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int i1 = scanner.nextInt();

        System.out.println(s1);
        System.out.println(i1);


    }


    public static String switcher(Integer number) {
        switch(number) {
            case 10:
                return "ten";
            case 20:
                return "twenty";
            default:
                return "Illegal number";
        }
    }

    public static void print(String word) {
        System.out.println(word);
    }

}