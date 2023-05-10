import java.util.Scanner;
class p26
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s,revers=0;
        System.out.println("enter the number");
        int num=sc.nextInt();
        int number=num;
        while(num>0)
        {
            s=num%10;
            // revers=revers*10+s;
            num=num/10;
        }
        if(number==revers)
        {
            System.out.println("enter number is palindron");
        }
        else
        {
            System.out.println("enter number is not palindron");
        }
    }
}