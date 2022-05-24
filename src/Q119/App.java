package Q119;

public class App {
    String greet = "Welcome!";
    public App(){
        String greet = "Hello!";

    }
    public void setGreet(){
        String greet = "Good Day!";
    }

    public static void main(String[] args) {
        App t=new App();
        String greet = "Good Luck!";
        System.out.println(t.greet);
    }
}

/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
Lead to pass your exam quickly and easily. First Test, First Pass! - visit - http://www.certleader.com
Answer: C
*/