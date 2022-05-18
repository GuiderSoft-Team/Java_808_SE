package Q66;

public class Test {
    public static void main(String[] args) {

        C2 obj1=new C1();
        I obj2= new C1();

        C2 s =(C2) obj2;
        I t=obj1;

        t.displayI();
        s.displayC2();

    }
}

// Answer
//C1C2