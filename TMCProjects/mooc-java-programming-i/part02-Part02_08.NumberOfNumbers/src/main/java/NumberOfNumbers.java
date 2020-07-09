
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amtInputVariable = 0;
        while (true) {
            System.out.println("Give a number:");
            Integer userInput = scanner.nextInt();
            if (userInput != 0) {
                amtInputVariable = amtInputVariable += 1;
                continue;
            }
            System.out.println("Number of numbers: " + amtInputVariable);
            break;
        }
    }
}
