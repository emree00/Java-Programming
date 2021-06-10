
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String a = scanner.nextLine();
            if(a.equals("")){
                break;
            }
            String[] b = a.split(" ");
            for (String b1 : b) {
                System.out.println(b1);
            }
        }
    }
}
