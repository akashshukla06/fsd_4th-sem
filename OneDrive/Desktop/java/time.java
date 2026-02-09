public class time {
   int hh,mm,ss;
   void input(int h, int m,int s){
    hh=h;
    mm=m;
    ss=s;
   } 
   void show(){
    System.out.println(hh);
    System.out.println(mm);
    System.out.println(ss);
   }
   
public void Add(time t1,time t2){
    ss = (t1.ss + t2.ss);
    mm = t1.mm+t2.mm + ss/60;
    ss %= 60;
    hh=t1.hh + t2.hh + mm/60;
    mm %=60;
}
    public static void main(String[] args) {
        time t1=new time();
        time t2=new time();
        time t3=new time();
        t1.input(15,20,30);
        t2.input(15,20,30);
        t1.show();
        t2.show();
        t3.Add(t1,t2);
        t3.show();


    }}

