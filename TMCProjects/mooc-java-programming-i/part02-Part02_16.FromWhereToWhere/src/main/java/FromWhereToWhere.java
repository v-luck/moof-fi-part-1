
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int userDestination= scanner.nextInt();
        System.out.println("Where from");
        int userBase= scanner.nextInt();
        for (int i = userBase; i<=userDestination; i++) {
            System.out.println(i);
        }
    }
}
