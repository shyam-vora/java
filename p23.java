import java.util.Scanner;
class p23
{
    public static void main(String[] args) {
        int row,colam;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter arry lanth");
        row=sc.nextInt();
        colam=sc.nextInt();
        int[][] arry=new int[row][colam];
        System.out.println("enter arry element");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<colam;j++)
            {
                arry[i][j]=sc.nextInt();
            }
        }
        System.out.println("your martix");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<colam;j++)
            {
                System.out.print(+arry[i][j]+"");
            }
            System.out.println("\n");

        }
        
    }
}