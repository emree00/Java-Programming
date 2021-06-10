import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GradeStatistics distri = new GradeStatistics();
        
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine()); 
            if(number == -1){
                break;
            }
            
            distri.addPointTotal(number);
        }
        
        distri.print();
    }
}
