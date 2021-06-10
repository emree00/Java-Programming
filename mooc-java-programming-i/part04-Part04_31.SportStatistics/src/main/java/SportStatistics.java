
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Game> list = recordTeam(file) ;
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Game> gamy = new ArrayList<>();

        for(Game theCount: list){
            if(team.equals(theCount.getHomeTeam()) || team.equals(theCount.getExtTeam())){
                gamy.add(theCount);
            }
        }
        int wins=0;
        for(Game theWin: gamy){
            if(theWin.winnerIs(team)){
                wins++;
            }
        }
        System.out.println("Games: "+ gamy.size());
        System.out.println("Wins: "+ wins);
        System.out.println("Losses: "+ (gamy.size()-wins));
    }
    
    public static ArrayList<Game> recordTeam(String file){

        ArrayList<Game> teams = new ArrayList<>();
        
        try(Scanner list = new Scanner(Paths.get(file))){
            
            while(list.hasNextLine()){
                String line = list.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                
                String[] parts = line.split(",") ;
                String homeName = parts[0];
                String extName = parts[1];
                int homePts = Integer.valueOf(parts[2]);
                int extPts = Integer.valueOf(parts[3]);
                
                teams.add(new Game(homeName, extName, homePts, extPts));
            }
            
        } catch(Exception e){
            System.out.println("failed"+e.getMessage());
        }
        
        return teams;
    }
}
