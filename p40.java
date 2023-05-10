class volume{
    int h;
    int w;
    int l;
    volume(int h,int w,int l){
        this.h=h;
        this.w=w;
        this.l=l;
 }
    void fidevolum(){
        int ans=h*w*l;
        System.out.println(ans);
    }              
}
public class p40{
    public static void main(String[] args) {
        volume sp=new volume(10,20,30);
        sp.fidevolum();
    }
} 
