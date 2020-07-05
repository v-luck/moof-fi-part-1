
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number:");
        Float number = Float.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);


    }
}
