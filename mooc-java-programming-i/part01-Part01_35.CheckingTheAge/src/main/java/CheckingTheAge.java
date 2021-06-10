
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.valueOf(scan.nextLine());
        System.out.print("How old are you? ");
        if(a>=0 && a<=120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
