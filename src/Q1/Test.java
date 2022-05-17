package Q1;
public class Test {
    public static void main(String[] args) {
        int x=1;
        int y=1;

        if(x++<++y)
        {
            System.out.print("hello");
        }else {
            System.out.print("welcome");
        }
        System.out.println("Log"+x+":"+y);

        /*what is the result?
        a. Hello Log 2:2
        b. Welcome Log 1:2
        c. Welcome Log 2:1
        d. Hello 1:2
        cevap:A
        */


    }
}
