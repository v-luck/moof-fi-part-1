
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        System.out.println("Give a word:");
         String user_input = scanner.nextLine();
        while (x < 3) {
            System.out.print(user_input);
            x++;
        }

        // Write your program here

    }
}
