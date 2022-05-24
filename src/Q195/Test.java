package Q195;

/*public class Test {
    public static void main(String[] args) {
        // Given the code fragment:
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

    }
}*/
/* A.
        for (int index = 1; index < 2; index++) {
            for (int idx = 1; idx <2 ; idx++) {
                System.out.print(shirts[index][idx]+":");
            }
        }
    B.
        for (int index = 0; index <=2; ) {
            for (int idx = 0; idx <=2 ;) {
                System.out.print(shirts[index][idx]+":");
            }
            index++;
        }
    C.
        for (int index = 0; index < 2; ++index) {
            for (int idx = 0; idx < index; idx++) {
                System.out.println(shirts[index][idx]+":");
            }
        }
    D.
        for (String[] c:shirts ) {
            for (String s:c ) {
                System.out.println(s+":");
            }
        }

    }
}
Answer:B*/