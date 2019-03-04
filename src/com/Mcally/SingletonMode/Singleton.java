package com.Mcally.SingletonMode;

/**
 * 单例模式(线程不安全)普通方式
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;


    }


}
