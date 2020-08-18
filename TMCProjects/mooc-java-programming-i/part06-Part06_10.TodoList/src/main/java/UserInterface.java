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
            System.out.print("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            this.check(command);
        }
    }

    public void add() {
        System.out.print("To add: ");
        String toAdd = this.scanner.nextLine();
        this.todoList.add(toAdd);
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(toRemove);
    }

    public void list() {
        this.todoList.print();
    }

    public void check(String command) {
        if (command.equals("add")) {
            this.add();
        }
        if (command.equals("remove")) {
            this.remove();
        }
        if (command.equals("list")) {
            this.list();
        }
    }
}
