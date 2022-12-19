package Q202;


public class Employee {
    public int salary=5;


    public static void main(String[] args) {
        Employee employee=new Employee();
        Employee manager=new Manager();
       Manager director=new Director();
        //line n1



    }
}
 class Manager extends Employee{
    public int budget;

}
 class Director extends Manager{
    public int stockOptions;
    public int salary=10;

}
   // And given this main method:



  /*  Which two options compile when placed at line n1 of the main method? (Choose two.)

        A.	director.stockOptions = 1_000;
        B.	employee.salary = 50_000;
        C.	manager.budget = 1_000_000;
        D.	manager.stockOption = 500;
        E.	employee.budget = 200_000;
        F.	director.salary = 80_000;

        Answer: B F

 */

