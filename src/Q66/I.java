package Q66;

interface I {
    public void displayI();
}
    abstract class C2 implements I {
        public void displayC2() {
            System.out.print("C2");
        }
    }

    class C1 extends C2 {
        public void displayI() {
            System.out.print("C1");
        }
    }

