package Q128;

import Q127.Main;

public class Myfield {
    int x;
    int y;

    public void dostuff(int x,int y)
    {
        x=x;
        y=this.y;
    }
    public void display()
    {
        System.out.print(x+" "+y+":");
    }

    public static void main(String[] args) {
        Myfield m1=new Myfield();
        m1.x=100;
        m1.y=200;

        Myfield m2=new Myfield();
        m2.dostuff(m1.x,m1.y);
        m1.display();
        m2.display();

        //what is result?
        //cevap, 100 200:0 0:
    }
}
