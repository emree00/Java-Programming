import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Container containerOne = new Container();
        Container containerTwo = new Container();
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First : " + containerOne);
            System.out.println("Second: " + containerTwo);
            System.out.print("> ");
            
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            if (input.equals("add")) {
                containerOne.add(amount);
            }

            if (input.equals("move")) {
                if (amount > containerOne.contains()) {
                    amount = containerOne.contains();
                }

                containerOne.remove(amount);
                containerTwo.add(amount);
                
            }

            if (input.equals("remove")) {
                containerTwo.remove(amount);
            }

            System.out.println("");
            
        }
        
        
    }
}