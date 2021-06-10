
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int b = 0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a==0) {
                break;
            }
            c = c+1;
            b=a+b;
        }
        System.out.println("Average of the numbers: "+ (1.0*b/c));
    }
}
