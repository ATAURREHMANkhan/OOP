abstract class Emp{
    public Emp()
    {
        System.out.println("Employee Abstract Class ");
    }
    public String Hello()
    {
        System.out.println("Hello Employee");
        return null;
    }
    abstract public void meth();
    //abstract public void meth2();
}

class SubEmp1 extends Emp{
    public void meth(){
        System.out.println("Welcome to the Office: ");
    }
}
abstract class SubEmp2 extends Emp{
    public void reply(){
        System.out.println("All good: ");
    }
}
public class Code51 {
    public static void main(String[] args) {
        SubEmp1 se = new SubEmp1();
        se.meth();
    }
}