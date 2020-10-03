import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String commandInput = scanner.nextLine();
            if (commandInput.equals("stop")) {
                break;
            }
            command(commandInput);
        }
    }

    public void command(String command) {
        switch (command) {
            case "add":
                System.out.print("To add: ");
                String addToToDoList = scanner.nextLine();
                todoList.add(addToToDoList);
                break;
            case "list":
                todoList.print();
                break;
            case "remove":
                System.out.print("Which one is removed? ");
                Integer removeToDoList = Integer.valueOf(scanner.nextLine());
                todoList.remove(removeToDoList);
                break;
        }
    }
}
