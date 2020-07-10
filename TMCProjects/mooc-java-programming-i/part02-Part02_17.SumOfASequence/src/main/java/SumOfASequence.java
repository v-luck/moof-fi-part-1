
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zero = 0;
        System.out.println("Last number?");
        int userLastNumber = scanner.nextInt();
        for (int i = 1; i <= userLastNumber; i ++) {
            zero += i;
        }
        System.out.println("The sum is " + zero);
    }
}
