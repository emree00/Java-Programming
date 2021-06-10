
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            Archive items = new Archive(identifier, name);

            if(!archive.contains(items)){
                archive.add(items);
            }
        }
        System.out.println("==Items==");
        
        for(Archive a: archive){
            System.out.println(a);
        }

    }
}
