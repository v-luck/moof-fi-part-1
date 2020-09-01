import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ReadingRecipe readingRecipe;
    public UserInterface(Scanner scanner, ReadingRecipe readingRecipe) {
        this.scanner = scanner;
        this.readingRecipe = readingRecipe;
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        ReadingRecipe recipe = new ReadingRecipe();
        recipe.scanFile(fileName);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        String command = scanner.nextLine();
    }

    public void checkCommand (String command) {
    }

}
