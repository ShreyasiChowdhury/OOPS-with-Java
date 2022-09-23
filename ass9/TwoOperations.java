import calculation.*;
import java.util.Scanner;
class TwoOperations
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter two decimal values:");
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        System.out.println("Integer Sum: "+Operations.sum(a,b));
        System.out.println("Integer Multiply: "+Operations.multiply(a,b));
        System.out.println("Double Sum: "+Operations.sum(c,d));
        System.out.println("Double Multiply: "+Operations.multiply(c,d));
    }
}
