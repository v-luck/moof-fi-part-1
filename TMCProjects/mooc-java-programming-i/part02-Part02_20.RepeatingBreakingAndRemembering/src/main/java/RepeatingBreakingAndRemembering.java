
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseValue = 0;
        int numberOfNumbers = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        System.out.println("Give numbers:");
        while (true) {
            int userValue = scanner.nextInt();
            if (userValue == -1) {
                break;
            } else {
                baseValue += userValue;
                numberOfNumbers++;
                if (userValue % 2 == 0) {
                    evenNumber++;
                } else {
                    oddNumber++;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + baseValue);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + (1.0 * baseValue/numberOfNumbers));
        System.out.println("Even: " + evenNumber);
        System.out.println("Odd: " + oddNumber);


    }
}
