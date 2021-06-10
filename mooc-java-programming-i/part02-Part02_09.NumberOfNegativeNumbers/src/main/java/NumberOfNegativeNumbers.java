
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a<0) {
                b = b + 1;
            } else if(a==0) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Number of negative numbers: "+b);
    }
}
