class thischek{
 static   int i=10;
     static void check()
    {
        System.out.println(i);
    }
}
public class p842
{
    public static void main(String[] args)
    {
        thischek sp=new thischek();
        sp.check();
    }
}