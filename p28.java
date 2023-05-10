import java.util.*;
public class p28 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter term");
                int n=sc.nextInt();
                fibo(n);
    }
    public static void fibo(int n) {
        int a=0,b=1,c;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+"  ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
// import java.util.*;
// public class p28{
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your a number");
//                 int a=sc.nextInt();
//         System.out.println("enter your b number");
//                 int b=sc.nextInt();
//                 max(a,b);
//     }
//     public static void max(int a, int b) {
//         if(a>b)
//             System.out.println("a is largest");
//         else
//             System.out.println("b is largest");
//     }
// }
