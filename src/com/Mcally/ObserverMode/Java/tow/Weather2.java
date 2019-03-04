package com.Mcally.ObserverMode.Java.tow;

import java.util.Observable;

//这种事推数据
public class Weather2 extends Observable {
    private Data d;

    public Weather2(Data d) {
        this.d = d;
    }

    public void setChanges() {
        setChanged();
        notifyObservers(d);

    }

}
