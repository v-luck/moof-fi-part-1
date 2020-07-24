
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");
        Statistics totalSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();

        while (true) {
            int userValue = scanner.nextInt();
            if (userValue == -1) {
                break;
            }
            totalSum.addNumber(userValue);
            if (userValue % 2 == 0) {
                evenSum.addNumber(userValue);
            } else {
                oddSum.addNumber(userValue);
            }
        }
        System.out.println("Sum: " + totalSum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
}
