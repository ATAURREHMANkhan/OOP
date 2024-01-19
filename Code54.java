class BankManagement{
    private String name, email;
    private long acc;
    private int pin;

    BankManagement()
    {
       
        System.out.println("Welcome to the Bank Management Account System");
    }

    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }

    public void setEmail(String e)
    {
        this.email = e;
    }
    public String getEmail()
    {
        return email;
    }
    
    public void setAcc(long a)
    {
        this.acc = a;
    }
    public long getAcc()
    {
        return acc;
    }
    
    public void setPin(int p)
    {
        this.pin = p;
    }
    public int getPin()
    {
        return pin;
    }
}

public class Code54 {
    public static void main(String[] args) {
        BankManagement u1 = new BankManagement();

        u1.setEmail("rehman.ata5576@gemail.com");
        u1.setName("Ata ur Rehman");
        u1.setPin(1234);
        u1.setAcc(92112457);
        System.out.println("The Name of User is : " + u1.getName());
        System.out.println("The Email of User is : " + u1.getEmail());
        System.out.println("The Account# of User is : " + u1.getAcc());
        System.out.println("The Pin of User Account is : " + u1.getPin());
    }
}
