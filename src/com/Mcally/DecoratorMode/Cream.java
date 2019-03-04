package com.Mcally.DecoratorMode;

//奶油类
public class Cream extends  Food{
    private  Food  basic_food;
    public  Cream(Food  b){
        this.basic_food=b;
    }

    public  String make(){
        return  basic_food.make()+"+奶油";
    }

}
