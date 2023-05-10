import java.util.Scanner;
class pp3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int lcm=2;
        System.out.println("enter the first number");
        int m=sc.nextInt();
        System.out.println("enter the second number");
        int n=sc.nextInt();
        while(true)
        {
            if(lcm%m==0 && lcm%n==0)
            {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
// import java.util.Scanner;
// class test 
// {
//     public static void main(String[] args)
//      {
//          int even=0,odd=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter arry size");
//         int size = sc.nextInt();
//         int[] a = new int[size];
//         System.out.println("enter arry element");
//         for (int i = 0; i < size; i++) {
//             a[i] = sc.nextInt();
//             // if (a[i]% 2 == 0) {
//             //     System.out.println("even=" + a[i]);
//             // } else {
//             //     System.out.println("odd=" + a[i]);
//             // }
//          }
//         for (int i= 0; i <size; i++) {
//             if (a[i]% 2 == 0) {
//                even++;
//             } else {
//                  odd++;
//             }
//         }
//         System.out.println("even=" + even);
//         System.out.println("odd=" + odd);

//     }
// }