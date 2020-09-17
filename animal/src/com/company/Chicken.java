package com.company;
import edible.Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howtoEat(){
        return "Chicken coule be fried";
    }
}
