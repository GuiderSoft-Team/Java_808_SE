package Q17;

public class Test {

    int x,y;

    public Test(int x,int y){
        initialize(x,y);
    }

    private void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        Test obj = new Test(x,y);
        System.out.println(x+" "+y);
    }

    /*
        What is the result?
        A. Compilation fails.
        B. 3 5
        C. 0 0
        D. 9 5

        Answer : B
     */
}
