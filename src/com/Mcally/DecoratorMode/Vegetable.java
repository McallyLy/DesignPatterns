package com.Mcally.DecoratorMode;

//蔬菜类
public class Vegetable extends Food {

    private Food basic_food;

    public Vegetable(Food b) {
        this.basic_food = b;
    }

    public String make() {
        return basic_food.make() + "+蔬菜";
    }
}
