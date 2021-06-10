import java.util.ArrayList;

public class Recipe {
    //simple class for handling the indivdual recipes, ingrendesnts are in an arrayList
    
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString(){
        
        return this.name +", cooking time: " + this.time;
    }
    
}
