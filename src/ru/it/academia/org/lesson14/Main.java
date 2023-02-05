package ru.it.academia.org.lesson14;

public class Main {

    public static void main(String[] args) {
        Thread runnable = new Thread(new MyRunnable());

        MyThread myThread = new MyThread();

//        runnable.start();
//        try {
//            runnable.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        myThread.start();


        myThread.setDaemon(true);


        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();

    }
}
