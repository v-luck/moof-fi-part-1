
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numberValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numberTwoValue = Integer.valueOf(scanner.nextLine());
        System.out.println(numberValue + " * " + numberTwoValue + " = " + (numberValue * numberTwoValue));

    }
}