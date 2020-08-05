package com.legend.dp.c21_singleton;

/*
 * 线程安全的单例，双重判断，提高了效率
 * */

public class Singleton3 {

    private static volatile Singleton3 instance;//注意加volatile->防止指令重排序造成的半初始化

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
