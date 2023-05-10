class Vehicaals {
    int maxSpeed;
    int noOfSheet;
    public void display() {
    System.out.println("max Speed is: " + maxSpeed);
   }
} 
   class Bike extends Vehicaals
 {
    int cc;
    boolean isMoped;
    public void display()
     {
        System.out.println("max Speed is: " + maxSpeed);
        System.out.println("no Of Sheet is: " + noOfSheet);
        System.out.println("CC is: " + cc);
        System.out.println("isMoped: " + isMoped);
    }
}
   public class p950 {
    public static void main(String[] args) {
    Bike b1=new Bike();
    b1.display();
    }
}   
