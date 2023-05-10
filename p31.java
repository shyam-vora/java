import java.util.*;
public class p31
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        float a=sc.nextInt();
        System.out.println("enter 2st number");
        float b=sc.nextInt();
        gcd(a,b);
    }
    public static float gcd(float a,float b)
    {
        float temp,t;
        if(a<b)
        {
            temp=a;
        }
        else
        {
            temp=b;
        }
        for(int i=1;i<=temp;i++)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
            else
            {
                return 0;
            }
            
        }
    }
}
