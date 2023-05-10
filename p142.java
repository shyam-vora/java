class MyException extends Exception {
    public MyException(String message)
    {
        // Call constructor of parent Exception
        super(message);
    }
}
// A Class that uses above MyException
public class p142{
    // Driver Program
    public static void main(String args[])      
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex)
         {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
} 