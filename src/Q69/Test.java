package Q69;

public class Test {
    public static void main(String[] args) {
        String[][] chs = new String[5][12];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
        //        chs[a][b] = "" + i;                       //Runtime Exception LİNE
                i++;
            }

        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}

//Answer: ArrayIndexOutOfBoundsException