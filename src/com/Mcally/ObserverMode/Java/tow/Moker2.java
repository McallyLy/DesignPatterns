package com.Mcally.ObserverMode.Java.tow;

import java.util.Observable;
import java.util.Observer;

public class Moker2  implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Data){
            Data d=(Data)arg;
            System.out.println(d.getName());
            System.out.println(d.getF());
        }

    }
}
