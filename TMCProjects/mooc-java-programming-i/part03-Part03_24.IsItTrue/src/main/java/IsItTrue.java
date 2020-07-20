
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String user_value = scanner.nextLine();
        if (user_value.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }


    }
}
