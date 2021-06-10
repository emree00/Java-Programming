
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int a  = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int b  = Integer.valueOf(scanner.nextLine());
        if(b<=a){
            for(int i = b; i<=a; i++){
                System.out.println(i);
            }
        }
    }
}
