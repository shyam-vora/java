import java.util.Scanner;
import java.lang.Math;
class p8
{
	public static void main(String[] args)
	{
        System.out.println("enter area");
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
            double r=Math.sqrt(d/3.14);
           double dr=2*r;      
        System.out.println(dr);      	
    }
}
