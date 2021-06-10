
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            names.add(parts[0]);
            birthYears.add(Integer.valueOf(parts[1]));
        }

        String longest = names.get(0);
        for (String name : names) {
            if(name.length() > longest.length()) {
                longest = name;
            }
        }
        System.out.println("Longest name: " + longest);

        int sumOfBirthYears = 0;

        for (int year : birthYears) {
            sumOfBirthYears = sumOfBirthYears + year;
        }

        System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());
    }
}


      /*Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum=0;
        String longest="";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int naissance = Integer.valueOf(parts[1]);
            String name = parts[0];
            longest = parts[0];
            if(longest.length() < name.length()){
                longest=name;
                name=parts[0];
            }
            sum = sum + naissance;
            count++;
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: "+1.0*sum/count);*/