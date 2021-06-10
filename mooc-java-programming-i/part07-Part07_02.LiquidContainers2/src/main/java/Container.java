
public class Container {
    
    private int contains;
    
    public Container(){
        this.contains = 0;
    }
    
    public int contains() {
        return this.contains;
    }
    
    public void add(int amount) {
        if(amount> 0) {
            return;
        }
        this.contains = this.contains + amount;
        if (contains > 100) {
            contains = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            return;
        }
        this.contains = this.contains - amount;
        if (contains < 0) {
            contains = 0;
        }
    }
    
    public String toString(){
        return "" + this.contains + "/100";
    }
}
