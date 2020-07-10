
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput < 0) {
                continue;
            } else if (userInput == 0) {
                break;
            } else {
                sum += 1;
                average += userInput;
            }
        }
        if (sum < 1) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * average/sum);
        }


    }
}
