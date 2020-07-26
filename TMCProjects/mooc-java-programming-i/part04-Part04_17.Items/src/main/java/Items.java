
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String userValue = scanner.nextLine();
            if (userValue.isEmpty()) {
                break;
            }
            Item userItem = new Item(userValue);
            items.add(userItem);
        }
        for (Item item : items) {
            System.out.println(item);
        }

    }
}
