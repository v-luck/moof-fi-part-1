import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ReadingRecipe readingRecipe;
    private String userFile;
    private Boolean isNotStop;
    private ArrayList<Food> returnedRecipeList;

    public UserInterface(Scanner scanner, ReadingRecipe readingRecipe) {
        this.scanner = scanner;
        this.readingRecipe = readingRecipe;
        this.isNotStop = true;
    }

    public void start() {
        System.out.print("File to read: ");
        userFile = scanner.nextLine();
        this.returnedRecipeList = this.readingRecipe.scanFile(userFile);
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipe by name");
        System.out.println("find cooking time - searches recipe by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (isNotStop) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            this.checkCommand(command);
            if (command.equals("stop")) {
                break;
            }
        }
    }

    public void checkCommand (String command) {
        switch (command) {
            case "list":
                System.out.println("");
                System.out.println("Recipes:");

                for (Food food : returnedRecipeList) {
                    System.out.println(food);
                }
                break;
            case "stop":
                isNotStop = false;
                break;

            case "find name":
                System.out.print("Searched word: ");
                String userWord = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Food food : returnedRecipeList) {
                    if (food.returnName().contains(userWord)) {
                        System.out.println(food);
                    }
                }
                break;

            case "find cooking time":
                System.out.print("Max cooking time: ");
                Integer userInt = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Food food : returnedRecipeList) {
                    if (food.returnCookingTime() <= userInt) {
                        System.out.println(food);
                    }
                }

                break;

            case "find ingredient":
                System.out.print("Ingredient: ");
                String userIngredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                for (Food food : returnedRecipeList) {
                    if (food.returnIngredients().contains(userIngredient)) {
                        System.out.println(food);
                    }
                }
        }
    }

}
