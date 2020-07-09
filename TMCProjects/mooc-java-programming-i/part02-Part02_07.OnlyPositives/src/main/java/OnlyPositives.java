
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int userNumber = scanner.nextInt();
            if (userNumber < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (userNumber == 0) {
                break;
            } else {
                System.out.println(userNumber * userNumber);
            }
        }
    }
}