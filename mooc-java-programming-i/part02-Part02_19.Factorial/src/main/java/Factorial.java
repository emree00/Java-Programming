
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int first  = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int facto=1;
        while(i<=first){
            facto=facto*i;
            i++;
        }
        System.out.println("Factorial: "+facto);
    }
}
