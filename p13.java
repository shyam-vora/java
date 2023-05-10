import java.util.Scanner;
class p13
{
	public static void main(String[] args)
	{
		int n1,n2;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two nuber");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		c=sc.next().charAt(0);      
		switch(c)
		{
			case 'a':
			System.out.println(n1+n2);
			case 'b':
			System.out.println(n1-n2);
			case 'c':
			System.out.println(n1*n2);
			case 'd':
			System.out.println(n1/n2);
		}
	}
}	