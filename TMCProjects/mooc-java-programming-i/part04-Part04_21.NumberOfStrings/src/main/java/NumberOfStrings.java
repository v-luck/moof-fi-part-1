
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        while (true) {
            String userValue = scanner.nextLine();
            if (userValue.equals("end")) {
                break;
            }
            amount += 1;
        }
        System.out.println(amount);

    }
}
