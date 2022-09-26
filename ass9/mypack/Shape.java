package mypack;
public class Shape
{
    public static double getArea(double l,double b)
    {
        return l*b;
    }
    public static double getArea(int side)
    {
        return side*side;
    }
    public static double getArea(double r)
    {
        return 3.14*r*r;
    }
}
