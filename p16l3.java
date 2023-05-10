import java.util.Scanner;
class p16l3
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        for (int i=a; i <=b; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}