package Q177;

public class Bird {
    public void fly(){
        System.out.println("Fly.");
    }
}
class Peacock extends Bird {
    public void dance() {
        System.out.println("Dance.");
    }

        /*insert code snippet here

        p.fly();
        p.dance();

        Which code snippet can be inserted to print Fly.Dance. ?
A. Bird p = new Peacock();
B. Bird b = new Bird();Peacock p = (Peacock) b;
C. Peacock b = new Peacock ();Bird p = (Bird) b;
D. Bird b = new Peacock ();Peacock p = (Peacock) b;
Answer: B
    }*/
}