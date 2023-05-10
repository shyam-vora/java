import java.util.*;
public class p29{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your  number");
                int n=sc.nextInt();
               int ans= prime(n);
               if(ans==0)
               {
                System.out.println("prime number");
               }
               else
               {
                System.out.println(" not prime number");
               }
    }
    public static int  prime(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}
