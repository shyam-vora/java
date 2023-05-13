interface transport
{
    public void deliver();
}
abstract class animal
{
    String name;
}
class tiger extends animal
{
   
}
class camel extends animal implements transport
{
	camel(){
		System.out.println("this is ");
	}
   public void deliver() {
	System.out.println("this is camel");
   };
}
class deer extends animal
{
    
}
class donkey extends animal implements transport
{
	
	public void deliver() {
		System.out.println("this is donkey");
	   };
}
public class p1233 {
    public static void main(String[] args) {
       tiger t=new tiger();
	    camle c=new camel();
		deer d=new deer();
		donkey d1=new donkey();
		t.deliver();
		c.deliver();
		d.deliver();
		d1.deliver();
    }
}

