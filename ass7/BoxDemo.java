package com.company;
class Box
{
    double l, h, w;
    Box(double l, double h, double w)
    {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    void display()
    {
        System.out.println("Length = " + l + "cm\nHeight = " + h + "cm\nWidth = " + w);
    }
}
//single inheritance
class BoxWeight extends Box
{
    double weight;
    BoxWeight(double l, double h, double w, double weight)
    {
        super(l, h, w);
        this.weight = weight;
    }
    @Override
    void display()
    {
        System.out.println("Length = " + l + "cm\nHeight = " + h + "cm\nWidth = " + w +
                "cm\nWeight = " + weight);
    }
}
//multilevel inheritance
class BoxPrice extends BoxWeight
{
    double cost;
    BoxPrice(double l, double h, double w, double weight, double cost)
    {
        super(l, h, w, weight);
        this.cost = cost;
    }
    @Override
    void display()
    {
        System.out.println("Length = " + l + "cm\nHeight = " + h + "cm\nWidth = " + w +
                "cm\nWeight = " + weight + "gm\nCost = Rs." + cost);
    }
}
//driver class
public class BoxDemo
{
    public static void main(String[] args)
    {
        BoxPrice box = new BoxPrice(8,5,10,100,50);
        box.display();
    }
}