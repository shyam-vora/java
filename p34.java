import java.util.*;
 class bank{
    int actno;
    String username;
    String email;
    String acttype;
    int actbalance;
    public void getdetalis()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter actno=");
        actno=sc.nextInt();
        String ans = sc.nextLine();
        System.out.println("enter username=");
        username=sc.nextLine();
        System.out.println("enter email=");
        email=sc.nextLine();
        System.out.println("enter acttype=");
        acttype=sc.nextLine(); 
        System.out.println("enter actbalance=");
        actbalance=sc.nextInt();
    }
    public void displaydetalis()
    {
        System.out.println("actno="+actno);
        System.out.println("username="+username);
        System.out.println("email="+email);
        System.out.println("acttype="+acttype);
        System.out.println("actbalance="+actbalance);
    }
}
public class p34{
    public static void main(String[] args) {
        bank sp=new bank();
        sp.getdetalis();
        sp.displaydetalis();
    }
}