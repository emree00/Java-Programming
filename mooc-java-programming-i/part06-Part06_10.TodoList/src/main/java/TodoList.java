import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todo;
    
    public TodoList(){
        this.todo = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todo.add(task);
    }
    
    public void print(){
        int index = 1;
        for (String e : todo) {
            System.out.println(index + ": " + e);
            index++;
        }
    }
    
    public void remove(int number){
        this.todo.remove(number-1);
    }
}
