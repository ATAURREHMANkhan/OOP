import java.util.Scanner;

public class Code33 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the username and pass : ");
        int username = sc.nextInt();
        int pass = sc.nextInt();
        if (username == 1234 || pass == 786)
        {
            System.out.println("True");
        }
    }
}
