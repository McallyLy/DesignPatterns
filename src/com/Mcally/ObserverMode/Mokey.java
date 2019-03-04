package com.Mcally.ObserverMode;
//观察者实现类
public class Mokey  implements  Observer {
    @Override
    public void update(String str, float f) {
        System.out.println("名称:"+ str +"---->"+ "值为:"+ f);
    }
}
