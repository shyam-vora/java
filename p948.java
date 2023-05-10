class xyz{
    int i;
    int m;
    int n;
    xyz()
    {
        
    }
    xyz(int i,int m,int n){
        this.i=i;
        this.m=m;
        this.n=n;
    }
}
class abc extends xyz{
    abc(int i,int m,int n)
    {
        super(i,m,n);
    }
    void display()
    {
        System.out.println(i);
        System.out.println(m);
        System.out.println(n);
    }
}
class p948
{
    public static void main(String[] args)
    {
        abc sp=new abc(10, 20, 40);
        sp.display();
    }
}