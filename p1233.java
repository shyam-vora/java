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
// public class AnimalTransportTest {
//     public static void main(String[] args) 
// 	{
//         Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};
        
//         for (Animal animal : animals) {
//             if (animal instanceof Transport) {
//                 Transport transportAnimal = (Transport) animal;
//                 transportAnimal.deliver();
//             }
//         }
//     }
// }

// interface Transport {
//     void deliver();
// }

// abstract class Animal {
//     // class implementation omitted for brevity
// }

// class Tiger extends Animal {
//     // class implementation omitted for brevity
// }

// class Camel extends Animal implements Transport {
//     @Override
//     public void deliver() {
//         System.out.println("Camel delivering goods");
//     }
// }

// class Deer extends Animal {
//     // class implementation omitted for brevity
// }

// class Donkey extends Animal implements Transport {
//     @Override
//     public void deliver() {
//         System.out.println("Donkey delivering goods");
//     }
// }

