
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.println("Give a number:");
            Integer value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            number += value;
        }
        System.out.println("Sum of the numbers: " + number);


    }
}
