package Q131;
class vehicle{
    int x;
    vehicle()
    {
        this(10); //line n1
    }
    vehicle(int x)
    {
        this.x=x;
    }
}
class car extends vehicle{
    int y;
    car()
    {
        super();
       // this(20); //line2
    }
    car(int y)
    {
        this.y=y;
    }

    public String toString() {
        return super.x+":"+this.y;
    }
}

public class Test {
    public static void main(String[] args) {
        vehicle y=new car();
        System.out.println(y);
    }

    //cevap error at line n2
}
