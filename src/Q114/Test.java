package Q114;

public class Test {
    public static void main(String[] args) {

        String [][] arr={{"A","B","C"},{"D","E"}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println(arr[i][j]+ " ");
                break;
            }
        }
       // continue;
    }
}

/*What is the result?
A. A B C
B. A B C D E
C. A B D E
D. Compilation fails.
Answer: C
*/