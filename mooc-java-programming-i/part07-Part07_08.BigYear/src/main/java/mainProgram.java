import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Birds> bird = new ArrayList<>();
        
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")){
                break;
            }
            
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                
                Birds birds = new Birds(name, latin);
                
                bird.add(birds);
            }
            
            if(command.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
   
                for(Birds b: bird){
                    if(b.containsBirds(name)){
                        b.countObs();
                        break;
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }
            
            if(command.equals("All")){
                for(Birds b: bird){
                    System.out.println(b);
                }
            }
            
            if(command.equals("One")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                for(Birds b: bird){
                    if(b.containsBirds(name)){
                        System.out.println(b);
                    }
                } 
            }
        }

    }

}
