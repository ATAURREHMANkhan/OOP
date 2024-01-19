
import java.util.Scanner;
public class Scan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Value of Ath variable : ");
        int a = sc.nextInt();

        System.out.println("Enter the Value of Bth variable : ");
        int b = sc.nextInt();

        int sum = a + b ;
        System.out.println(sum);

        int sub = a - b ;
        System.out.println(sub);

         int multi = a * b ;
        System.out.println(multi);

         int div = a / b ;
        System.out.println(div);

          int mod = a % b ;
        System.out.println(mod);
    }
}

    



