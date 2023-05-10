import java.util.Scanner;
class p20
{
    public static void main(String[] args) {
        int lanth;
        int odd=0,even=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter arry lanth");
        lanth=sc.nextInt();
        int[] arry=new int[lanth];
        for( int i=0;i<lanth;i++)
        {
            arry[i]=sc.nextInt();
            if(arry[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print( "even number is "+even);
        System.out.println( "even number is"+odd); 
    }
}