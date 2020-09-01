
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReadingRecipe recipe = new ReadingRecipe();
        UserInterface userInterface = new UserInterface(scanner, recipe);
        userInterface.start();
    }

}
