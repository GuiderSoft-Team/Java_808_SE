package Q71;

class C2 {
    public void displayC2(){
        System.out.println("C2");
    }
}

interface I{
    public void displayI();//gövdesiz metot olmalı

}

class C1 extends C2 implements I{

    @Override  // İNTERFACE İN metotlarınının hepsini implement eden sınıfta tanımlamak zorundayız
    public void displayI() {
        System.out.println("C1");
    }
}

/*public class Test{
    public static void main(String[] args) {
        C2 obj1=new C1();
        I obj2=new C1();

        C2 s=obj2;
        I t=obj1;
        t.displayI();
        s.displayC2();
    }
}*/

/*
* What is the result?
 A.C2C1
 B C1C2
 C C1C1
 D Compilation fails
 **/


