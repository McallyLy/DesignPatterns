package com.Mcally.ObserverMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气类实现主题（本质被观察者--》动作改变）
 */
public class WeatherData implements Subject {
    private String Name;
    private float aFloat;
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer object) {
        observers.add(object);
    }

    @Override
    public void removeObserver(Observer object) {
        int i = observers.indexOf(object);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(Name, aFloat);
        }
    }

    public void setNameAndaFloat(String name, float f) {
        this.Name = name;
        this.aFloat = f;
        notifyObservers();

    }
}
