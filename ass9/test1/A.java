package test1;

public class A {
    public int num1;
    protected int num2;
    int num3;
    private int num4;

    public static void main(String[] args) {
        A obj = new A();
        obj.update();
    }
    void update()
    {
        num4=18;
        System.out.println(num4);
    }
    public void hello()
    {
        num1=100;
        System.out.println(num1);;
    }
}
