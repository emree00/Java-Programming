
public class Birds {
    
    private String name;
    private String latin;
    private int count;
    
    public Birds(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.count = 0;
    }
    
    public boolean containsBirds(String searched){
        return this.name.contains(searched);
    }
    
    public void countObs(){
        this.count++;
    }
    
    @Override
    public String toString() {
        return this.name +"("+this.latin+"): "+this.count+" observations";
    }
}
