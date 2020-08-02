package com.legend.dp.c21.singleton;

/*
 * 线程安全的单例，但每次都加锁，效率低
 * */

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        synchronized (Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2();
            }
        }
        return instance;
    }

}
