package Q6;

import java.io.IOException;

class X {
    public void printfilecontent()
    {
        //codes goes here
        throw new IOException();
    }

}
public class Test {
    public static void main(String[] args) {
        X obj=new X();
        obj.printfilecontent();
    }

}
/*
which two modifications should you make so that the code compiles,
a. replace line 16 with

 */
