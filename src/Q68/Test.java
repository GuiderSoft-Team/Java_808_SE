package Q68;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException e) {
            System.out.println("A");
        }
    }

    public static void method1() {          //line n1
        try {
            throw 3 > 10 ? new MyException() : new Exception();
        } catch (IOException ie) {
            System.out.println("I");
        } catch (Exception re) {
            System.out.println("B");

        }

    }
}

//Answer: B