import java.util.Scanner;
class pp5
{
    public static void main(String[] args) 
    {
    //    int  k=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  number");
        int n1=sc.nextInt();
        for(int i=1;i>=n1;i--)
        {
            for(int j=1;j>=n1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }
