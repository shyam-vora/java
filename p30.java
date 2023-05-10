import java.util.*;
import java.lang.*;
public class p30 {
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice= a.area of cricul b.area of trigal c.area of squre");
        c=sc.next().charAt(0);
        switch(c)
        {
            case 'a':
            System.out.println("enter area of criclu");
            double a=sc.nextDouble();
            System.out.println(area(a));
            break;
            case 'b':
            System.out.println("enter your h");
            double s=sc.nextDouble();
            System.out.println("enter your b ");
            double b=sc.nextDouble();
            System.out.println(area(s,b));
            break;
            case 'c':
            System.out.println("enter side of squre");
            double d=sc.nextDouble();
            System.out.println(area(d));
                break;

        }
    }
    public static double area( float a) {
        double area=(Math.PI)*a*a;
        return area;
    }
    public static double area( double a, double b) {
        double area=0.5*a*b;
        return area;
    }
    public static double area( double a) {
        double area=a*a;
        return area;
    }

}

