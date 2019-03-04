package com.Mcally.DecoratorMode;

//面包类
public class Bread extends  Food {
  private  Food  basic_food;

  public  Bread(Food  food){
      this.basic_food=food;

  }
    public String make() {
        return basic_food.make()+"+面包";
    }

}
