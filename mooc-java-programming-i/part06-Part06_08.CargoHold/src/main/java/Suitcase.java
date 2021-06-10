import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() {
        int weight = 0;

        for (Item e : items) {
            weight += e.getWeight();
        }
        return weight;
    }
    
    public void addItem(Item item){

        // poids precedent + le nouveau poids
        if(totalWeight() + item.getWeight()  > this.maxWeight){
            return;
        } 
        this.items.add(item);
    }
    
    public void printItems(){
        for (Item e : items) {
            System.out.println(e);
        }
    }
    
    public Item heaviestItem() {
        
        if(items.isEmpty()){
            return null;
        }
        
        Item returnHeaviest = this.items.get(0);
        
        for(Item i: this.items){
            if(returnHeaviest.getWeight() < i.getWeight()){
                returnHeaviest = i;
            }
        }
        
        return returnHeaviest;
               
    }
    
    public String toString() { 
        if(this.items.isEmpty()){
           return "no items (0 kg)"; 
        }
        if(this.items.size()==1){
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
         
        return this.items.size()+ " items (" + this.totalWeight() + " kg)";
    }
   
}

