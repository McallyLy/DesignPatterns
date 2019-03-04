package com.Mcally.ObserverMode.Java;

import java.util.Observable;

//java 内置的观察者模式
public class Weather  extends Observable {
    private  String  Name;
    private   Float  f;

    public  void  setNameAndFloat(String s,Float f){
        this.Name=s;
        this.f=f;
        setChanged();
        notifyObservers();
    }

    public String getName() {
        return Name;
    }

    public Float getF() {
        return f;
    }
}
