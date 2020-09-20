import java.util.Scanner;

public class userInterface {
    private Container container;
    private Scanner scanner;
    public userInterface(Container container, Scanner scanner) {
        this.container = container;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

        }
    }

    public void command(String command) {
        String[] commandParameters = command.split(" ");

    }
}
