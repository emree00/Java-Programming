import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private Grade grades;
    
    public UserInterface(Scanner scanner, Grade grades){
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start(){
       readPoints();
       System.out.println("");
       printAverageAll();
       printAveragePassing();
       printPassingPercentage();
       printGradeDistribution();           
    }
    
    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        
        while(true){
         
            String input = scanner.nextLine();

            int points = Integer.valueOf(input);
            
            if(points == -1){
                break;
            }
            
            if(points < 0 || points > 100){
                continue;
            }
            
            this.grades.addG(points);
        }
    }
    
    public void printAverageAll() {
        System.out.println("Point average (all): " + grades.gradeAverage());
    }

    public void printAveragePassing() {

        if (grades.passingAverage() == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grades.passingAverage());
        }
    }

    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + grades.passPercentage());
    }
    
    public void printGradeDistribution() {
   
        System.out.println("Grade distribution: ");
                
        int grade = 5;
        while(grade >= 0){
            int stars = grades.numberOfGrades(grade);
            System.out.print(grade+": ");
            printsStars(stars);
            System.out.println("");
            grade--;
            
        }
    }
    
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}

