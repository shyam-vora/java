import java.util.*;
public class p26 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your p value");
               int a=sc.nextInt();
       System.out.println("enter your r value");
               int b=sc.nextInt();
       System.out.println("enter your n value");
               int c=sc.nextInt();
              intrest(a,b,c);
   }
   public static void intrest( int p ,int r,int n) {
       int s=p*r*n/100;
       System.out.println(s);
   }
}
