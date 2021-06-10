import java.util.Scanner;

public class UserInterface {
    
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner){
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
       
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                String toAdd = scanner.nextLine();
                this.todolist.add(toAdd);
                
            } else if (command.equals("list")) {
                this.todolist.print();
                
            } else if (command.equals("remove")) {
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.todolist.remove(toRemove);
            }
        }
    }
}
