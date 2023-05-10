import java.util.*;
public class P36{
    public static void main(String[] args) {
        dmeo2 sp=new dmeo2();
        sp.getdetalis();
        sp.displaydetalis();
    }   
 }
 class dmeo2{
   int enrollmentno;
   String name;
   int sem;
   int cpi;
   int spi;
   public void getdetalis()
   {
       Scanner sc=new Scanner(System.in);

       System.out.println("enter id number=");
       enrollmentno =sc.nextInt();
       System.out.println("enter name=");
       String ans = sc.nextLine();
       name=sc.nextLine();
       System.out.println("enter sem=");
       sem=sc.nextInt(); 
       System.out.println("enter cpi=");
       cpi=sc.nextInt();
       System.out.println("enter spi=");
       spi=sc.nextInt();
   }
   public void displaydetalis()
   {
       System.out.println("enrollmentno="+enrollmentno);
       System.out.println("name="+name);
       System.out.println("sem="+sem);
       System.out.println("cpi="+cpi);
       System.out.println("spi="+spi);
   }
}
