package Q154;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList mylist=new ArrayList();

        String[] myArray;

        try {
            while (true){
                mylist.add("My String");
            }
        }catch (RuntimeException re){
            System.out.println("Caught a RunTimeException");
        }catch(Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");


    }
}
/*What is the result?
A. Execution terminates in the first catch statement, and Caught a RuntimeException is printed to the
console.
B. Execution terminates in the second catch statement, and Caught an Exception is printed to the console.
C. A runtime error is thrown in the thread "main".
D. Execution completes normally, and Ready to use is printed to the console.
E. The code fails to compile because a throws keyword is required.
Answer: C*/
