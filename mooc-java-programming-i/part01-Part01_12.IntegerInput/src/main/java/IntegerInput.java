
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String b = scanner.nextLine();
        int a = Integer.valueOf(b);
        System.out.println("You gave the number "+a);
        

    }
}
