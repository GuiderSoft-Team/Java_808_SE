package Q129;

public class Test {
    public static void main(String[] args) {
        try {
            int num=10;
            int div=0;
            int ans=num/div;
        }catch (ArithmeticException ae)
        {
            //ans=0; liine n1
        }catch (Exception e)
        {
            System.out.println("invalid calculation");
        }
        //System.out.println("answer="+ans); line n2
    }
    // what is result?
}
