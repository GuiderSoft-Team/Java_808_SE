package Q4;

public class Test {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        /* line n1*/
        do {
            idx++;
        }while (idx>=size);

        System.out.println("top elements:"+stack[idx]);



        /*
        which code fragment, inserted at line 1, prints "the top elements:30"?
        a.do {
            idx++;
        }while (idx>=size);

        b. while (idx<size)
        {
            idx++;
        }
        c. do {
            idx++;
        }while (idx<size-1);

        d. do {
            idx++;
        }while (idx<=size);

        e. while (idx<=size-1)
        {
            idx++;
        }
        cevap;c */

    }
}
