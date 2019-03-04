package com.Mcally.SingletonMode;

//静态内部类方式
public class Singleton4 {
    private Singleton4() {
    }

    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
