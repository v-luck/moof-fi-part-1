
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Archives> archivedItems = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identification = scanner.nextLine();
            if (identification.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archives item = new Archives(identification, name);
            if (!archivedItems.contains(item)) {
                archivedItems.add(item);
            }


        }

        System.out.println("==Items==");
        for (Archives archiveItem : archivedItems) {
            System.out.println(archiveItem);
        }


    }
}

