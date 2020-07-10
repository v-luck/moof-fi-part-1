
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseValue = 0;
        int userInput = scanner.nextInt();
        for (int i = baseValue; i < userInput+1; i ++) {
            System.out.println(i);
        }

    }
}
