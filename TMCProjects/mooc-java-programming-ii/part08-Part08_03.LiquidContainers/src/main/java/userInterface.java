import java.util.Scanner;

public class UserInterface {
    private Container container1;
    private Container container2;
    private Scanner scanner;
    public UserInterface(Container container1, Container container2, Scanner scanner) {
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            print();
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            command(input);
            System.out.println();
        }
    }

    public void command(String command) {
        String[] commandParameters = command.split("(?<=\\D)(?=\\d)");
        String commandCall = commandParameters[0];
        Integer commandAmount = Integer.valueOf(commandParameters[1]);

        switch (commandCall) {
        case "add ":
            container1.add(commandAmount);
            break;
        case "remove ":
            container2.remove(commandAmount);
            break;
        case "move ":
            Integer containerMove = container1.contains();
            container1.remove(commandAmount);
            Integer removeFromSecond = containerMove - container1.contains();
            container2.add(removeFromSecond);
            break;
        }
    }

    public void print() {
        System.out.println(String.format("First: %s\nSecond: %s", container1, container2));
    }
}
