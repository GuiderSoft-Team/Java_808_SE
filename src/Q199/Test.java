package Q199;

public class Test {
    public static void main(String[] args) {
        String stuff="TV";
        String res=null;

        if (stuff.equals("TV")){
            res="Walter";
        }else if (stuff.equals("Movie")){
            res="White";
        }else {
            res="No Result";
        }
    }
}

/*
Which code fragment can replace the if block?

A
stuff.equals("TV")?res="Walter":stuff.equals("Movie")?
 res="White":res="No Result";
B
 res=stuff.equals("TV")?res="Walter" else stuff.equals
 ("Movie")?"White":"No Result";
C
res= stuff.equals("TV")? stuff.equals("Movie")?"Walter":
"White":"No Result";
D
res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?
"White":"No Result";

A.	Option A
B.	Option B
C.	Option C
D.	Option D

Answer: D

 */



