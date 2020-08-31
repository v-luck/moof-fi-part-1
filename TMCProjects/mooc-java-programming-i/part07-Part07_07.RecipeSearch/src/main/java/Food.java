import java.util.ArrayList;

public class Food {
    private String recipeName;
    private Integer cookingTime;
    private ArrayList<String> ingredientList;

    public Food(String recipeName, Integer cookingTime, ArrayList ingredientList) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
    }

    public String toString() {
        return recipeName + ", cooking time: " + cookingTime;
    }

}
