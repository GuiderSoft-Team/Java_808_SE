package Q186;

  public class Test {
      public static void main(String[] args) {
          S2 sobj = new S2();
          sobj.display(10, 100);
      }
}
    class S1{
        protected void display( int x){
            System.out.println("Parent"+x);
        }
    }
    class S2 extends S1{
        public void display(int x,int y){
            this.display(x);
            display(y);
            super.display(y);
        }

        public void display(int x){
            System.out.println("Child"+x);
        }

    }


/*What is the result?
Child10
 Child100
Parent100
cevap A*/



