import java.nio.ShortBuffer;
import java.util.*;
class student{
   int id;
   String name;
   String gender;
   double mark;
   public void getdetalis()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your detils");
       name=sc.nextLine();
     gender=sc.nextLine();
     id=sc.nextInt();
     mark=sc.nextDouble();
    }
   public void displaydetalis()
   {
      System.out.println("name="+name); 
      System.out.println("gender="+gender); 
      System.out.println("id="+id);
      System.out.println("mark="+mark); 
    }
}
public class p32
{
   public static void main(String[] args) 
   {
       student sp=new student();
       sp.getdetalis();
       sp.displaydetalis();
    }
}
