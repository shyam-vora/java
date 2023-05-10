import java.util.Scanner;
class p22
{
    public static void main(String[] args) {
        int lanth;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter arry lanth");
        lanth=sc.nextInt();
        int[] arry=new int[lanth];
        System.out.println("enter arry element");
        for( int i=0;i<lanth;i++)
        {
            arry[i]=sc.nextInt();
        }
        System.out.println("enter a find number");
        int num,flag=0;
        num=sc.nextInt();
        for(int i=0;i<lanth;i++)
        {
            if(num==arry[i])
            {
                System.out.println("ans " +  arry[i]);
                flag=1;
                break;
            }
         }
            if(flag==0)
                System.out.println("not found");
 
    }
}