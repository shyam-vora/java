import java.util.*;
public class p1153
 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    char[] arr=str.toCharArray();
    for(char x:arr)
       {
        if (x=='a'||  x=='e'||  x=='i'||  x=='o'||  x=='u')  
        { 
            System.out.print(x+"  "); 
        } 
       } 
    }
 }
