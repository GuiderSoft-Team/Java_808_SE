package Q215;

public class Test {
    
}
/*
class LogFileException extends Exception {}
class AccessViolationException extends RuntimeException {}

1.public class App {
    2.  public static void main (String[] args) throws LogFileException {
        App obj = new App ();
        try {
            obj.open();
            obj.process();
                //insert code here                
        }
        catch (Exception e) {
            System.out.println("Completed.");
        }
    }
    public void process() {
        System.out.println("Processed");
        throw new LogFileException();
    }
    public void open () {
        System.out.println ("Oplened.");
        throw new AccessViolationException();
    }    
}   

Which action fixes the compiler error?
A. At line 17, add throws AccessViolationException
B. At line 13, add throws LogFileException
C. At line 2, replace throws LogFileException with throws AccessViolationException
D. At line 7, insert throw new LogFileException ();
Answer: D
*/
