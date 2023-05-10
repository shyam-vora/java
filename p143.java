import java.util.*;
public class p143 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
        System.out.println("enter your opeater according your choice");
        int op=sc.nextInt();
        switch (op) {
            case 1:
                System.out.println(a+b);
                break;
                case 2:
                System.out.println(a-b);
                break;
                case 3:
                System.out.println(a*b);
                break;
                case 4:
                try {
                   double  c=a/b ;// cannot divide by zero
                    System.out.println("Result = " + c);
                }
                catch (ArithmeticException s) 
                {
                    System.out.println(s.getMessage());
                }
                break;
            default:
                System.out.println("you are choicing rong oprater");
                break;
        }
    }
}
