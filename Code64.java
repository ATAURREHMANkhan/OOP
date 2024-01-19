class Employee{
    int salary = 20000;
    int print1()
    {
        return salary;
    }
}

class peon extends Employee{
    int increment = 5000;
}

public class Code64 {
    public static void main(String args[]) {
    peon h1 = new peon();
    System.out.println("Increment of Peon is:"+h1.increment);
    System.out.println("h1.print1()");
 }   
}
