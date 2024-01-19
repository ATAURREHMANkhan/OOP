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
public class Code56 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Portal of Employee Management");

        Employee abdullah = new Employee();

        abdullah.setId(501);
        abdullah.setName("Abdullah Ayub");
        abdullah.setRegID(421111111);
        abdullah.age = 29;

        System.out.println(abdullah.getId());
        System.out.println(abdullah.getName());
        System.out.println(abdullah.getRegID());
        System.out.println(abdullah.age);

        Employee shafiq = new Employee();

        shafiq.setId(112);
        shafiq.setName("Shafique Awan");
        shafiq.setRegID(422222222);
        shafiq.age = 40;

        System.out.println(shafiq.getId());
        System.out.println(shafiq.getName());
        System.out.println(shafiq.getRegID());
        System.out.println(shafiq.age);
    }
}
