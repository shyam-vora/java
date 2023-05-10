import java.util.Scanner;
class p25
{
    /**
     * Constructs a new object.
     */
    public p25() {
        super();
    }

    public static void main(String[] args) {
        int row,colam;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter arry length:");
        System.out.println("Enter number of row:");
        row=sc.nextInt();
        System.out.println("Enter number of column:");
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
        System.out.println("the matrix is");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<colam;j++)
            {
                System.out.println(arry[i][j]+"  ");
            }
        }
        for( int i=0;i<row;i++)
        {
            int rowsum=0;
            for(int j=0;j<colam;j++)
            {
                rowsum+=arry[i][j];
            }
            System.out.println((i+1)+" row is" + rowsum);
        }
        // for( int i=0;i<row;i++)
        // {
        //     for(int j=0;j<colam;j++)
        //     {
        //         System.out.println("sum" +(i+1)+"row is" + sum);
        //     }
        // }
        // for colam
        
        for( int i=0;i<row;i++)
        {

            int colamsum=0;
            for(int j=0;j<colam;j++)
            {
                colamsum+=arry[j][i];
            }
            System.out.println((i+1)+" colam is " + colamsum);

        }
        // for( int i=0;i<row;i++)
        // {
        //     for(int j=0;j<colam;j++)
        //     {
        //         System.out.println("sum" +(i+1)+"colam is" + colamsum);
        //     }
        // }
    }
}