import java.util.*;
public class p1152 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
       String str=sc.nextLine();
       StringBuffer s1 = new StringBuffer(str); 
       StringBuffer sb=new StringBuffer(str);  
       System.out.println("Before reverse : "+sb);  
               sb.reverse();  
               System.out.println("After Reverse : "+sb);
               if (sb.toString().equals(s1.toString()))
                {
                System.out.println("pai");
               } 
               else
               {
                System.out.println("not");
               }
    }
}  
 

// import java.util.Scanner; 
// import java.lang.StringBuffer;  
// public class test  
// {  
//     public static void main(String[]args)  
//     { 
//         Scanner sc = new Scanner(System.in);  
//         String str = sc.nextLine(); 
//         StringBuffer s1 = new StringBuffer(str); 
//         StringBuffer sb=new StringBuffer(str);  
//         System.out.println("Before reverse : "+sb);  
//         sb.reverse();  
//         System.out.println("After Reverse : "+sb); 
//         if (sb.equals(s1)) 
//         { 
//             System.out.print("pelindrome");     
//         } else
//          { 
//             System.out.print("not pelindrome");  
//         } 
//     }  
// }