package test2;
import test1.A;

public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.update();
    }
    void update()
    {
        num2=50;
        System.out.println(num2);
    }
}
