import java.util.Scanner;
class P12
{
	public static void main(String[] args)
	{
		double m1,m2,m3,m4,m5,p;
		Scanner sc=new Scanner(System.in);
		m1= sc.nextDouble();
		m2= sc.nextDouble();
		m3= sc.nextDouble();
		m4= sc.nextDouble();
		m5= sc.nextDouble();
		p=(m1+m2+m3+m4+m5)/5;
		if(p<=35)
		{
			System.out.println("fail");
		}
		else if(p>35&&p<45)
		{
			System.out.println("pass");
		}
		else if(p>45&&p<60)
		{
			System.out.println("2nd class");
		}
		else if(p>60&&p<70)
		{
			System.out.println("1st class");
		}
		else
		{
			System.out.println("a++");
		}
	}
}