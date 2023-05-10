class Rectangle {
    int l;
    int w;
    static int count;
    int ans;
    static
    {
        System.out.println("this is satatic block");
        count=0;
    }
{
        System.out.println("this is inilaize block");
        count++;
}
    Rectangle()
    {
        l=0;
        w=0;
    }
    Rectangle(int x, int y) {
        l=x;
        w=y;
    }
Rectangle(Rectangle sp2){
    l=sp2.l;
    w=sp2.w;
}
void area()
{
     ans=l*w;
}
 void dispaly(){
    System.out.println(l);
    System.out.println(w);
    System.out.println(ans);
    System.out.println(count);
}
 }
public class p844{
    public static void main(String[] args) {
        Rectangle sp=new Rectangle();
        Rectangle sp2=new Rectangle(10,20);
        Rectangle sp3=new Rectangle(sp2);
        sp.area();
        sp.dispaly();
        sp2.area();
        sp2.dispaly();
        sp3.area();
        sp3.dispaly();
    }
}
// import java.util.Scanner;
// class p844
// {
//     public static void main(String[] args)
//      {
//         Scanner sc = new Scanner(System.in);
//        String name=sc.next();
//        int count=0;
//        char[] arr=name.toCharArray();
//        for(char x:arr){
//         count++;
//        }System.out.println(count);

//     }
// }
