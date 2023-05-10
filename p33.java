import java.util.*;
 class candidate {
    double id;
    String name;
    double age;
    double height;
    double weight;
    public void getdetalis()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name=");
        name=sc.nextLine();
        System.out.println("enter id=");
        id=sc.nextDouble();
        System.out.println("enter age=");
        age=sc.nextDouble();
        System.out.println("enter height=");
        height=sc.nextDouble();
        System.out.println("enter weight=");
        weight=sc.nextDouble();
    }
    public void  displaydetalis()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
    }
}
public class p33
{
    public static void main(String[] args) 
    {
        candidate sp=new candidate();
        sp.getdetalis();
           sp.displaydetalis();
    }
}                     
