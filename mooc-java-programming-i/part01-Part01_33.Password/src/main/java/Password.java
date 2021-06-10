
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String a = scan.nextLine();
        System.out.println("Password?");
        if(a.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
