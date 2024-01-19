class student {
    String name ;
    int age ;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    
}
public class code59{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Ata ur Rehman";
        s1.age = 21;
        s1.printinfo();


        student s2 = new student ();
        s2.name = "Bilal";
        s2.age = 22 ;
        s2.printinfo ();




        student s3 = new student ();
        s3.name = "Sher khan" ;
        s3.age  = 23 ;
        s3.printinfo ();


        student s4 = new student ();
        s4.name = "Hammad Bangash";
        s4.age = 20  ;
        s4.printinfo();

    }
}