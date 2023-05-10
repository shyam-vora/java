import java.util.*;
public class p27
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your a number");
                int a=sc.nextInt();
        System.out.println("enter your b number");
                int b=sc.nextInt();
                max(a,b);
    }
    public static void max(int a , int b)
     {
        if(a>b)
              System.out.println("a is largest");
        else
            System.out.println("b is largest");
    }
}