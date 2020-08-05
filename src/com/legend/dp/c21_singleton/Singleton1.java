package com.legend.dp.c21_singleton;

/*
 * 线程不安全的单例
 * */

public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

}
