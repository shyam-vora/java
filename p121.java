 abstract class vegtable
{
    String colour = "green";
    abstract void display(String col);
}
class potato extends vegtable
{
    String name="potato";
     void display(String c)
     {
        colour = c;
        System.out.println(name + " " + colour);
    }
}
class brinjal extends vegtable
{
    String name="brinjal";
     void display(String c){
        colour = c;
        System.out.println(name + " " + colour);
    }
}
class tomato extends vegtable
{
    String name="tomato";
     void display(String c)
     {
        colour = c;
        System.out.println(name + " " + colour);
    }
}

public class p121 {
    public static void main(String[] args) {
        potato sc=new potato();
        sc.display("brown");
        brinjal sc1=new brinjal();
        sc1.display("purpule");
        tomato sc2=new tomato();
        sc2.display("red");
    }
}