import java.util.Scanner;
class p21
{
    public static void main(String[] args) {
        int lanth;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter arry lanth");
        lanth=sc.nextInt();
        int[] arry=new int[lanth];
        for( int i=0;i<lanth;i++)
        {
            arry[i]=sc.nextInt();
            if(arry[i]%3==0 || arry[i]%5==0)
                sum+=arry[i];
        }
        System.out.println(sum);
    }
}