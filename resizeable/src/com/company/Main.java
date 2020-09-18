package com.company;

import java.rmi.ConnectIOException;

public class Main {

    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.resize(Math.round(Math.random()*100));

        Square square=new Square(5);
        square.resize(Math.round(Math.random()*100));

        Rectangle rectangle=new Rectangle(5,10);
        rectangle.resize(Math.round(Math.random()*100));
    }
}
