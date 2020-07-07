
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueSecond = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int valueThird = Integer.valueOf(scanner.nextLine());
        double sum = value +valueSecond + valueThird;
        System.out.println("The average is " + (sum/3));

    }
}
