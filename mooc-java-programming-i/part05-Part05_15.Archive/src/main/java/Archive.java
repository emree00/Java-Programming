
public class Archive {
    private String id;
    private String name;
    
    public Archive(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        Archive compareItem = (Archive) compared;
        if(this.id.equals(compareItem.id)){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.id +": "+this.name;
    }
}
