import java.util.Scanner;
class pp4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int temp,t=1;
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
        int n2=sc.nextInt();
         if(n1<n2)
        {
            temp=n1;
        }
        else
        {
            temp=n2;
        }
        for(int i=1;i<=temp;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                t=i;
            }
        }
        System.out.println(t);
    }
 }
