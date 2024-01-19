abstract class Emp{
    Emp()
    {
        System.out.println("Welcome to Abstract Employee Portal: ");
    }
    public void Hello1()
    {
        System.out.println("Hello All Employee ");
    }
    abstract public void print();
}

class SubEmp extends Emp{
    public void print()
    {
        System.out.println("Welcome Everyone ");
    }
}
public class Code52 {
    public static void main(String[] args) {
        SubEmp se = new SubEmp();
        se.print();
    }
}
