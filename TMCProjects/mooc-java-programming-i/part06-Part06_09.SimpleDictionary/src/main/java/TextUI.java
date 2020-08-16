import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if (this.addEqual(word)) {
                System.out.println("Bye bye!");
                break;
            }
            System.out.println("Unknown command");
        }
    }

    public boolean endEqual(String word) {
        return word.equals("end");
    }

    public boolean addEqual(String word) {
        return word.equals("add");
    }

}


