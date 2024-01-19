class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Code55 {
    public static void main (String args [])
    {
        Student s1 = new Student();
        s1.name = "Abdullah Ayub";
        s1.age = 29;
        s1.printinfo();

        Student s2 = new Student();
        s2.name = "Bilawal";
        s2.age = 19;
        s2.printinfo();
    }
}   
