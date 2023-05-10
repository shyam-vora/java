import java.util.*;
class circle{
   float pai;
   float r;
   float ans;
   public void getdetalis(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter pai vlaue=");
       pai=sc.nextFloat();
       System.out.println("enter VALUE OF R=");
       r=sc.nextFloat(); }
   public void displaydetalis(){
      System.out.println(ans=pai*r*r); }
   public void displaydetalis2(){
      System.out.println(2*pai*r);}}
public class p37{
   public static void main(String[] args) {
       circle sp=new circle();
       sp.getdetalis();
       sp.displaydetalis();
       sp.displaydetalis2();}}
