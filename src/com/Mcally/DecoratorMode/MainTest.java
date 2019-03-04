package com.Mcally.DecoratorMode;

public class MainTest {
    public static void main(String[] args) {
        Food f=new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(f.make());
    }
}
