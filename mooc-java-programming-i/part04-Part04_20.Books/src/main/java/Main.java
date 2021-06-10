import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            book.add(new Book(title, pages, publicationYear));        
        }
        System.out.println("");
        
        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();
        
        for(Book books: book){
            if(information.equals("everything")){
                System.out.println(books);
            } else if(information.equals("name")){
                System.out.println(books.getName());
            }
        }

    }
}
