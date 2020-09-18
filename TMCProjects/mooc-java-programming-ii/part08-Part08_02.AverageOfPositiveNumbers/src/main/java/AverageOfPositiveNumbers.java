
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            Integer userInput = scanner.nextInt();
            if (userInput > 0) {
                sum += userInput;
                count ++;
            } else if (userInput == 0) {
                break;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            Double average = (double) sum / count;
            System.out.println(average);
        }


    }
}
