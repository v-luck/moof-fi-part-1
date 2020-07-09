
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer sum = 0;
        Integer amt = 0;
        while (true) {
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            sum += value;
            amt += 1;
        }
        Double average = 1.0 * sum / amt;
        System.out.println("Average of the numbers: " + average);

    }
}
