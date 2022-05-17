package Q2;

public class App{
    public static void main(String[] args) {
        int i=10;
        int j=20;
        int k=(j+=i)/5;
        System.out.print(i+":"+j+":"+k);

        /*what is the result?
        a. 10:30:6
        b.10:22:22
        c.10:22:20
        d.10:22:6
        cevap;A
        * */
    }
}
