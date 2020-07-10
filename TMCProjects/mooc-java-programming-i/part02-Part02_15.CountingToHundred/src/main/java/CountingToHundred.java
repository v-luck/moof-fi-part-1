
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int baseValue = 101;
        for (int i = userInput; i < baseValue; i++) {
            System.out.println(i);
        }

    }
}
