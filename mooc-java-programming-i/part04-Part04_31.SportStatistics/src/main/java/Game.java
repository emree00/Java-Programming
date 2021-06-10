
public class Game {
   
    private String homeTeam;
    private String extTeam;
    private int homePts;
    private int extPts;
    
    public Game(String homeTeam, String extTeam, int homePts, int extPts){
        this.homeTeam=homeTeam;
        this.extTeam=extTeam;
        this.homePts=homePts;
        this.extPts=extPts;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    public String getExtTeam(){
        return extTeam;
    }
    public boolean winnerIs(String team){
        if(team.equals(homeTeam) && homePts > extPts){
          return true;  
        }
        if(team.equals(extTeam) && homePts < extPts){
          return true;
        }
        return false;
    }
}