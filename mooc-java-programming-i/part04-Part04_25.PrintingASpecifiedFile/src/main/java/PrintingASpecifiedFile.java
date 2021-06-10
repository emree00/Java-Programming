
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        
        try (Scanner theFile = new Scanner(Paths.get(file))) {

    // we read the file until all lines have been read
            while (theFile.hasNextLine()) {
                    // we read one line
                    // we print the line that we read
                System.out.println(theFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}
