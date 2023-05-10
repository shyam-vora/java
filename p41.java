import java.util.*;
class complex{
    int r;
    int i;
    complex(){
        
    }
    complex(int x,int y){
        r=x;
        i=y;
    }
    void add(complex sp1, complex sp2)
    {
        r=sp1.r+sp2.r;
        i=sp1.i+sp2.i;
    }
    void dispaly()
    {             
        System.out.println(r+ " "+i+"i");
    }
}
public class p41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int r=sc.nextInt();
        // int i=sc.nextInt();
        complex sp1=new complex(15,25);
        // r=sc.nextInt();
        // i=sc.nextInt();
        complex sp2=new complex(15 ,25);
        complex addComplex=new complex();
        addComplex.add(sp1, sp2);
        addComplex.dispaly();
    }
    
}