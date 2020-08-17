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
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (this.addEqual(command)) {
                this.addEqualWord();
                continue;
            }

            if (this.searchEqual(command)) {
                this.searchEqualWord();
                continue;
            }
            if (this.endEqual(command)) {
                System.out.println("Bye bye!");
                break;
            }
            System.out.println("Unknown command");
        }
    }

    public boolean endEqual(String command) {
        return command.equals("end");
    }

    public boolean addEqual(String command) {
        return command.equals("add");
    }

    public void addEqualWord() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    public boolean searchEqual(String command) {
        return command.equals("search");
    }

    public void searchEqualWord() {
        System.out.println("To be translated: ");
        String word = scanner.nextLine();
        if (this.dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");

        } else {
            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }


}


