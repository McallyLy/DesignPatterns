package com.Mcally.ObserverMode.Java;

import java.util.Observable;
import java.util.Observer;

//观察者实现
//这种事拉数据
public class Moker implements Observer {
    @Override
    public void update(Observable o, Object arg) {
      if(o instanceof  Weather){
          System.out.println(((Weather) o).getName());
          System.out.println(((Weather) o).getF());
      }


    }
}
