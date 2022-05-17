package Q23;

public class Test {
    public static void main(String[] args) {
        char colorCode='y';
        switch (colorCode){
            case 'r':
                int color=100;
                break;
            case 'b':
                color=10;
                break;
            case 'y':
                color=1;
                break;
        }

       System.out.println(color);
    }

}

/*
What is the result?
A.	It results in a compile time error at line 18.
B.	It results in a compile time error at line 9.
C.	It prints : 1
D.	It results in a compile time error at lines at lines 12 and 15.

Answer: A

 */
