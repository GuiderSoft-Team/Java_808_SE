package Q86;
/*
public class Test {
    class A{
        public void test(){
            System.out.println("A");
        }
    }
    class B extends A{
        public void test(){
            System.out.println("B");
        }
    }
    public class C extends A{
        public void test(){
            System.out.println("C");
        }

        public static void main(String[] args) {
            A b1=new A();
            A b2=new C();
            A b3=(B) b2;
            b1=(A) b2;          //line n1
            b1.test();          //line n2
            b3.test();
        }
    }
}

/*
What is the result?
Answer: A ClassCastException is thrown only at line n1
*/
