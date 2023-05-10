public class p141 {
        public static void main(String args[])
        {
                try {
                    int a = 30, b = 0;
                    int c = a / b; // cannot divide by zero
                    System.out.println("Result = " + c);
                }
                catch (ArithmeticException s) 
                {
                    System.out.println(s.getMessage());
                }
        }
}
