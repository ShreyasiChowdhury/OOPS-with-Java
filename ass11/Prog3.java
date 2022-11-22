package com.company;

public class Prog3 {
    static void f1() {
        int val = 10 / 0;
        System.out.println(val);
    }
    static void f2() {
        f1();
    }
    static void fun() {
        try {
            f2();
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args) {
        Prog3.fun();
        System.out.println("Hello World");
    }
}
