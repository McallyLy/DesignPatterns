package com.Mcally.SingletonMode;

//双重校验
public class Singleton6 {
    private Singleton6() {
    }

    private volatile static Singleton6 instance;

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }

            }

        }
        return instance;

    }


}
