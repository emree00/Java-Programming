
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter = new Counter(1);
        counter.increase();
        counter.increase();
        counter.decrease();
        System.out.println(counter.value());
        
    }
}
