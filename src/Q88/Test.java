package Q88;

public class Test {

    public static void main(String[] args) {
        int x=6;
        while (isAvailable(x)){ //while (is Available(--x)) {
            System.out.print(x);
        }
    }
    public static boolean isAvailable(int x){
        return --x>0?true:false;
    }

}
/*
Which modification enables the code to print 54321?


Answer: Replace  while (is Available(--x)*/