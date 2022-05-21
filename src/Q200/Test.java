package Q200;

import java.util.ArrayList;
import java.util.List;

public class Test {
    class Patient{
        String name;
        public  Patient(String name){
            this.name=name;
        }
    }


}
 /*   And the code fragment:

public class Test{
    public static void main(String[] args) {
        List ps=new ArrayList();
        Test.Patient p2=new Test.Patient("Mike);
                ps.add(p2);

        //insert code here

        if (f>=0){
            System.out.println("Mike Found");
        }
    }
}

Which code fragment, when inserted at line 14, enables the code to print Mike Found?
A
int f=ps.indexOf (p2);
B
int f=ps.indexOf (Patient("Mike"));
C
int f=ps.indexOf (new Patient("Mike");
D
Patient p=new Patient("Mike");
int f=ps.indexOf (p);

A.	Option A
B.	Option B
C.	Option C
D.	Option D

Answer: A

  */