package com.company;
// run time polymorphism
// overriding
class Shape {
    void area() {
        System.out.println("I am in shape");
    }
}

class Circle extends Shape {
    @Override   //annotation
    void area() {
        System.out.println("I am in circle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // parent reference child object
        Shape obj = new Circle();   //upcasting
        obj.area();
    }
}