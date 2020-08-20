
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.print("First: ");
            System.out.println(containerOne);
            System.out.print("Second: ");
            System.out.println(containerTwo);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                containerOne.add(amount);
            } else if (command.equals("move")) {
                if (containerOne.contains() - amount < 0) {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(amount);
                } else {
                    containerOne.remove(amount);
                    containerTwo.add(amount);
                }
            } else if (command.equals("remove")) {
                containerTwo.remove(amount);
            }

        }
    }

}
