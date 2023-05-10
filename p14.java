import java.util.Scanner;
class p14
{
	public static void main(String[] args)
	{
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nuber");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a==b||a==c)
		{
			System.out.println("equilateral");
		}
		else if(a==b||b==c||c==a)
		{
			System.out.println("isosceles");
		}
		else
		{
			System.out.println("right angled");
		}

	}
}	


