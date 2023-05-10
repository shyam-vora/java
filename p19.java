import java.util.Scanner;
class p19
{
    public static void main(String[] args)
    {
        int num,r;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        while(num!=0){
           
             r=num%10;
            num/=10;
            System.out.print(r);
        }
    }
}