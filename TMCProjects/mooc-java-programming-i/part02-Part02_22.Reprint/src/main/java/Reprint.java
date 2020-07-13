
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many time?");
        int userInteger = Integer.valueOf(scanner.nextLine());
        while (userInteger > 0) {
            printText();
            userInteger --;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
