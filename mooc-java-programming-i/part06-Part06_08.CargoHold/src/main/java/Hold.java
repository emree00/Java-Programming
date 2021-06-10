import java.util.ArrayList;

public class Hold {
    
    private int maxiWeight;
    private ArrayList<Suitcase> suit;
    
    public Hold(int maxiWeight){
        this.maxiWeight = maxiWeight;
        this.suit = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() <= this.maxiWeight){
            this.suit.add(suitcase);
        } 
    }
    
    public int totalWeight() {
        int weight = 0;

        for (Suitcase e : suit) {
            weight += e.totalWeight();
        }
        return weight;
    }
    
    public void printItems(){
        for(Suitcase s: suit){
            s.printItems();
        }
    }
    
    public String toString() {
        if (this.suit.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suit.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suit.size() + " suitcases (" + this.totalWeight() + " kg)";

    }

}

