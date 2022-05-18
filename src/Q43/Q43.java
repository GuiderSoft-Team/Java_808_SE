package Q43;

import java.util.ArrayList;
import java.util.Arrays;

public class Q43 {

    // 43. Given the code fragment:
    public static void main(String[] args) {

        String[] arr=("Hi","How","Are","You");
        List<String> arrList =new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(String s)) ->(return s.length()<=2;))){
            System.out.println(s+"removed")'
        }
    }
}

  /*  What is the result?
        A. Compilation fails.
        B. Hi removed
        C. An UnsupportedOperationException is thrown at runtime.
        D. The program compiles, but it prints nothing.

        Answer:A
*/