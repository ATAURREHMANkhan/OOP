class Pragramminglanguage{
    public void display(){
        System.out.println("I am Programming Language.");
    }
}
class Java extends Pragramminglanguage{
    public void display(){
        System.out.println("I am object Oriented Pragramming Language.");
    }
}
public class Code69 {
    public static void main(String[] args) {
        Pragramminglanguage p1;
        p1 = new Pragramminglanguage();
        p1.display();
        p1 = new Java();
        p1.display();
    }
    
}

