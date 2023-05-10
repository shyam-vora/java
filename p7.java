import java.util.Scanner;
class p7
{
	public static void main(String[] args)
	{
		double weight,hight,blm;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        weight=sc.nextDouble();
        hight=sc.nextDouble();
        weight=weight*0.4535;
        hight=hight*0.0254;
        blm=weight/hight*hight;
        System.out.println(blm);
    }

}
