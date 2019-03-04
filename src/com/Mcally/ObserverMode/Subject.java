package com.Mcally.ObserverMode;

//主题接口
public interface Subject {
    //注册
    void registerObserver(Observer object);

    //删除
    void removeObserver(Observer object);

    //更新
    void notifyObservers();

}
