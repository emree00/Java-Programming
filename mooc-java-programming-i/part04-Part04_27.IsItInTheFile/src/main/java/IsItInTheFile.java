
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        int lines = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                //lit chaque ligne 1 par 1 si il contient pas le cherché
                if (!line.contains(searchedFor)) {
                    continue;
                }
                lines++;
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if (lines == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }
    }
}

/* import java.util.ArrayList;
public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        try (Scanner theFile = new Scanner(Paths.get(file))) {
            while (theFile.hasNextLine()) {
                list.add(theFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+e.getMessage()+" failed.");
            return;
        }
        
        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
 
    }
}*/