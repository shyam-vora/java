interface eventlister{
    public void perform();
}
interface mouselister extends eventlister{
    public void mouseclik();
    public void mousepress();
    public void  mouserelise();
    public void mousemoved();
    public void mousedragged();
}
interface keylister extends eventlister{
   public void keyprsed();
   public void keyrelised();
}
class demo  implements mouselister,keylister{
    public void perform(){}
    public void keyprsed() {
        System.out.println("keypreessd");
    }
    public void mouseclik(){
    }
    public void mousepress(){
    }
    public void mousemoved(){}
    public void mouserelise(){}
    public void mousedragged(){
    }
    public void keyrelised(){
    }
}
public class pp122 {
    public static void main(String[] args)
    {
        demo d = new demo();
        d.keyprsed();
    }
}
