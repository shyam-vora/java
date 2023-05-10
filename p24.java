import java.util.Scanner;
class p24
{
    public static void main(String[] args) {
        int row,colam;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter arry row of matrix 1 ");
        row=sc.nextInt();
        System.out.println("enter arry colam of matrix 1 ");
        colam=sc.nextInt();
        System.out.println("enter second matrix row");
        int a=sc.nextInt();
        System.out.println("enter second matrix colam");
        int b=sc.nextInt();
        if(colam!=a)
        {
            System.out.println("invalid row colam");
        }
    else
    {
        int[][] arry=new int[row][colam];
        System.out.println("enter arry element");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<colam;j++)
            {
                arry[i][j]=sc.nextInt();
            }
        }
        
        
        int[][] arrym=new int[a][b];
        System.out.println("enter second martix element");
        for( int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arrym[i][j]=sc.nextInt();
            }
        }
        int[][] mul=new int[row][colam];
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<colam;j++)
            {
                mul[i][j]=0;
                for(int k=0;k<colam;k++)
                {
                    mul[i][j]+=arry[i][k]*arrym[k][j];
                }
            }
        }
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<colam;j++)
            {
                System.out.print(mul[i][j]+" ");
               
            }
            System.out.println();
        }
    }
    }
}