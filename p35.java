 import java.util.*;
class employe{
   int id;
   String name;
   String desgnation;
   int age;
   int salary;
   public void getdetalis()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter id number=");
       id=sc.nextInt();
       System.out.println("enter name=");
       String ans = sc.nextLine();
       name=sc.nextLine();
       System.out.println("enter desgnation=");
       desgnation=sc.nextLine();
       System.out.println("enter age=");
       age=sc.nextInt(); 
       System.out.println("enter salary=");
       salary=sc.nextInt();
   }
   public void displaydetalis()
   {
       System.out.println("id="+id);
       System.out.println("name="+name);
       System.out.println("desgnation="+desgnation);
       System.out.println("age="+age);
       System.out.println("salary="+salary);
   }
}
public class p35{
   public static void main(String[] args) {
       employe sp=new employe();
       sp.getdetalis();
       sp.displaydetalis();
   }
}
