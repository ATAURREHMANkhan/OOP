abstract class Bike{  
    abstract void run();  
  }   
  
  class SubBike extends Bike{  
  void run(){
    System.out.println("running safely");
    }     
}
public class Code53 {
    public static void main(String args[]){  
        Bike obj = new SubBike();  
        obj.run();
    }
}
