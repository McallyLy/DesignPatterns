package com.Mcally.ObserverMode.Java.tow;

public class Data {
    private String Name;
    private  Float f;

    public Data(String name, Float f) {
        Name = name;
        this.f = f;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Float getF() {
        return f;
    }

    public void setF(Float f) {
        this.f = f;
    }
}
