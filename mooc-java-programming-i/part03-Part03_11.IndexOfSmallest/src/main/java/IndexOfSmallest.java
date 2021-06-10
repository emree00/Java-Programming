
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a==9999){
                break;
            }
            list.add(a);
        }
        int i=0;
        int smallest = list.get(0);
        while(i<list.size()){
            if(smallest> list.get(i)){
                smallest = list.get(i);
            }    
            i++;
        }
        System.out.println("Smallest number: "+smallest);
        
        int k=0;
        while(k<list.size()){
            if(smallest==list.get(k)){
                System.out.println("Found at index: "+k);
            }
            k++;
        }
    }
}
