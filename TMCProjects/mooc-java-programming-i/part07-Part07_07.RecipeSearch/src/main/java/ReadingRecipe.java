import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingRecipe {
    private ArrayList<Food> foodArrayList;
    private Scanner fileScanner;

    public ReadingRecipe() {
    }

    public void scanFile(String fileName) {
        try {
            fileScanner = new Scanner(Paths.get(fileName));
            while (fileScanner.hasNextLine()) {

                String recipeName = fileScanner.nextLine();
                Integer cookingTime = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredientList = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                   String ingredients = fileScanner.nextLine();
                   if (ingredients.isEmpty() || !fileScanner.hasNextLine()) {
                       Food food = new Food(recipeName, cookingTime, ingredientList);
                       break;
                   }
                   ingredientList.add(ingredients);
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }


}
