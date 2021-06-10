import java.util.ArrayList;

public class RecipeBook {
    
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);

    }

    //way easier to just print from the recipe like this with a void method
    // i tried to return an object at first then print it in the UI but it became very messy
    public void printByName(String name) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lowercases both so regradless of case
                if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(e);

                }

            }

        }

    }

    public void printByTime(String time) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lower caseing both so it finds it regradless of case
                if (e.getTime() <= Integer.valueOf(time)) {

                    System.out.println(e);

                }

            }

        }

    }

    public void printByIngredient(String ingredient) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lower caseing both so it finds it regradless of case
                if (e.getIngredients().contains(ingredient.toLowerCase())) {

                    System.out.println(e);

                }

            }

        }

    }

    public void printRecipeBook() {

        for (Recipe e : this.recipes) {
            System.out.println(e);

        }

    }

}
    
