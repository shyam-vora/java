class account {
     String name;
     int ActNo;
     double Amount;
    account(String n, int Act, double Amt) {
        name = n;
        ActNo = Act;
        Amount = Amt;
    }
   }
   class Interest extends account
    {
        double r;
        double n;
    Interest(double r, double n) 
    {
        super("renish", 232323, 100);
        this.r = r;
        this.n = n;
    }
    public void interest() 
    {
        System.out.println("name:"+name);
        System.out.println("actno"+ActNo);
        System.out.println("interest is: " + ((Amount * r * n) ));
    }
   }
   public class p947
   {
    public static void main(String[] args) {
    Interest i = new Interest(1, 1);
    i.interest();
    
}
   }
