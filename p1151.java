import java.util.Scanner;
class p1150 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
       String name=sc.next();
       int count=0;
       char[] arr=name.toCharArray();
       for(char x:arr)
       {
         count++;
       }
       System.out.println(count);
    }
}
