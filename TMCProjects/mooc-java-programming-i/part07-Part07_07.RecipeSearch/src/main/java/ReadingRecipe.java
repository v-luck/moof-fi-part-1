import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingRecipe {
    private Scanner fileScanner;

    public ReadingRecipe() {
    }

    public ArrayList<Food> scanFile(String fileName) {
        ArrayList<Food> foodArrayList = new ArrayList<>();
        try {
            fileScanner = new Scanner(Paths.get(fileName));
            while (fileScanner.hasNextLine()) {

                String recipeName = fileScanner.nextLine();
                Integer cookingTime = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredientList = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String ingredients = fileScanner.nextLine();
                    if (ingredients.isEmpty() || !fileScanner.hasNextLine()) {
                        foodArrayList.add(new Food(recipeName, cookingTime, ingredientList));
                        break;
                    }
                    ingredientList.add(ingredients);
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return foodArrayList;
    }


}
