import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> pers;
    
    public Room (){
        this.pers = new ArrayList<>();
    }
    
    public void add(Person person){
        this.pers.add(person);
    }
    
    public boolean isEmpty(){
        if(this.pers.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.pers;
    }
    
    public Person shortest(){
        if(isEmpty()){
            return null;
        }
        
        Person shortPers = this.pers.get(0);
        
        for(Person sho: pers){
            if(shortPers.getHeight() > sho.getHeight()){
                shortPers = sho;
            }
        }
        return shortPers;
    }
    
    public Person take() {
        Person p = shortest();
        
        this.pers.remove(p);
        
        return p;
    }
}
