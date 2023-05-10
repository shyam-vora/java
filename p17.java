import java.util.Scanner;
class p17
{
    public static void main(String[] args) {
        int num,sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        for (int i=1; i <=num; i++)
        {
           sum*=i;
           System.out.println(sum);
        }
    }
}