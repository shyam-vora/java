import java.util.*;
class time{
   int hour;
   int minute;
   time(int hour,int minute)
   {
    this.hour=hour;
    this.minute=minute;
   }
   public void getdetalis(int x,int y)
   {
       Scanner sc=new Scanner(System.in);
       hour=hour+x;
       minute=minute+y;
       if(minute>60)
        {
            minute-=60;
            hour++;
        } 
        else
        {
            hour-=12;
        }  
        System.out.println(hour+":"+minute); 
    }
}
public class p38{
   public static void main(String[] args) {
       time sp=new time(2,55);
       sp.getdetalis(2,55);
   }
}
