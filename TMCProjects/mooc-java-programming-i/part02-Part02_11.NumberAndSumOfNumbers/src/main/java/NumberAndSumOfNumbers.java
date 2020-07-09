
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumValue = 0;
        int amtNumbers= 0;
        while (true) {
            System.out.println("Give a number:");
            Integer value = scanner.nextInt();
            if (value==0) {
                break;
            } else {
                sumValue += value;
                amtNumbers += 1;
            }
        }
        System.out.println("Number of numbers: " + amtNumbers);
        System.out.println("Sum of the numbers: " + sumValue);

    }
}
