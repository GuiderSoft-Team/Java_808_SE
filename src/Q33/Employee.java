package Q33;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {
        //line n1
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        //line n2
        System.out.println(e);
    }
}
// Which two modifications, when made independently, enable the code to print Joe:true: 100.0? (Choose two.)

/*    A)Replace line n2 with:
            e.name="Joe";
            e.contract=true;
            e.salary=100;

            B)Replace line n2 with:
            this.name="Joe";
            this.contract=true;
            this.salary=100;

            C)Replace line n1 with:
            this.name=new String("Joe");
            this.contract=new Boolean(true);
            this.salary=new double(100);

            D)Replace line n1 with:
            name="Joe";
            contract=TRUE;
            salary=100.Of;

            E)Replace line n1 with:
            this("Joe",true,100);

            A.Option A

            B.Option B

            C.Option C

            D.Option D

            Cevap A-C*/
