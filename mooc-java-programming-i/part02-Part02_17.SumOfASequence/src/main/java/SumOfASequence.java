
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int n  = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("the sum is "+sum);
    }
}
