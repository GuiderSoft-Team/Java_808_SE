package Q6;
import java.io.IOException;

class X {
   /* public void printfilecontent() ;
    {//codes goes here
         throw new IOException();
    }*/
}
public class Test {
    public static void main(String[] args) {
        X obj=new X();
        //obj.printfilecontent();


    }

}
/*
which two modifications should you make so that the code compiles,
a. replace line 14 with
 try { obj.printfilecontent();}
      catch (Exception e){}
        catch (IOException e){}

b. replace line 7 with throw IOexception("exception raised");
c.replace line 11 with public static void main (string[]arg) throws exception{}
d. at line 14, insert throw new IOexception();
e. replace line 5 with public void printfilecontent() throws IOexception

cevap, c/e
 */
