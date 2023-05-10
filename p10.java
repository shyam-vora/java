import java.util.Scanner;
class p10
{
	public static void main(String[] args)
	{
		char word;
		Scanner sc=new Scanner(System.in);
		word = sc.next().charAt(0);
		if(word=='a'||word=='A'||word=='e'||word=='E'||
			word=='i'||word=='I'||word=='o'||word=='O'||word=='u'||word=='U')
		{
			System.out.println("vowels");
		}
		else
		{	
			System.out.println("consonants");
	     }
	}
}