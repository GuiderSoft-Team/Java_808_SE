package Q18;

public class Test {
    public static void main(String[] args) {



        Car c1 = new Car("Auto");
        Car c2 = new Car("4W",150,"Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
    }

    /*
            What is the result?
                A. 4W 100 Auto4W 150 Manual
                B. null 0 Auto4W 150 Manual
                C. Compilation fails only at line n1
                D. Compilation fails only at line n2
                E. Compilation fails at both line n1 and

            Answer : A
     */
}
