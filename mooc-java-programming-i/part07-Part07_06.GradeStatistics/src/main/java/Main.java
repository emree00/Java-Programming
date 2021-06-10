import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grade register = new Grade();

        // Create a new instance of UserInterface
        UserInterface ui = new UserInterface(scanner, register);

        // Call the method to start the program from UserInterface
        ui.start();
    }
}

/*      Scanner scanner = new Scanner(System.in);

        GradeStatistics distribution = new GradeStatistics();

        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            distribution.addPointTotal(number);
        }

        distribution.print();
    }
}
*/