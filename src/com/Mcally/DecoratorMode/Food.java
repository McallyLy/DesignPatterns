package com.Mcally.DecoratorMode;
//装饰者模式
public class Food {
    private String food_Name;

    public Food() {
    }

    public Food(String Name) {
        this.food_Name = Name;
    }
    public String make() {
        return food_Name;
    }


}
