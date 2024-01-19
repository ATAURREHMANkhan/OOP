class student {
    String name ;
    int age ;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    
}
public class code58{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Ata ur Rehman";
        s1.age = 21;
        s1.printinfo();


        student s2 = new student ();
        s2.name = "Bilal";
        s2.age = 22 ;
        s2.printinfo ();
    }
}