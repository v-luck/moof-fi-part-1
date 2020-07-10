
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int series = 0;
        System.out.println("First number?");
        Integer firstValue = scanner.nextInt();
        System.out.println("Last number?");
        Integer secondValue = scanner.nextInt();
        for (int i = firstValue; i <= secondValue; i++) {
            series += i;
        }
        System.out.println("The sum is: " + series);
    }
}
