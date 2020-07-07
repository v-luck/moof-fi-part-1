
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        Integer valueOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer valueTwo = Integer.valueOf(scanner.nextLine());
        System.out.println(valueOne + " + " + valueTwo + " = " + (valueOne + valueTwo));
        System.out.println(valueOne + " - " + valueTwo + " = " + (valueOne - valueTwo));
        System.out.println(valueOne + " * " + valueTwo + " = " + (valueOne * valueTwo));
        System.out.println(valueOne + " / " + valueTwo + " = " + (Double.valueOf(valueOne) / Double.valueOf(valueTwo)));

    }
}
