
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a!=0) {
                b = b + 1;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: "+b);
    }
}
