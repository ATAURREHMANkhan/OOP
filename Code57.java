class Employee {
    private int id;
    private String name;
    private long regID;
    int age; //default (no package modifier)

    public void setId(int i)
    {
        id = i;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }

    public void setRegID(long ri)
    {
        regID = ri;
    }
    public long getRegID()
    {
        return regID;
    }
}
public class Code57 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Portal of Employee Management");

        Employee ali = new Employee();

        ali.setId(301);
        ali.setName("Ali Ahmed");
        ali.setRegID(421111111);
        ali.age = 22;

        System.out.println(ali.getId());
        System.out.println(ali.getName());
        System.out.println(ali.getRegID());
        System.out.println(ali.age);

        Employee hamza = new Employee();

        hamza.setId(112);
        hamza.setName("Hamza Khan");
        hamza.setRegID(422222222);
        hamza.age = 30;

        System.out.println(hamza.getId());
        System.out.println(hamza.getName());
        System.out.println(hamza.getRegID());
        System.out.println(hamza.age);

         
         Employee rehman = new Employee();

        rehman.setId(112);
        rehman.setName("Rehman Maqbool");
        rehman.setRegID(899999999);
        rehman.age = 40;

        System.out.println(rehman.getId());
        System.out.println(rehman.getName());
        System.out.println(rehman.getRegID());
        System.out.println(rehman.age);
    }
}
