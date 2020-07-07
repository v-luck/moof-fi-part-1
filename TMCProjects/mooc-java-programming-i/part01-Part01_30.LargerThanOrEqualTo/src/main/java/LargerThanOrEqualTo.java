
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        Integer value = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        Integer valueTwo = Integer.valueOf(scan.nextLine());
        if (value == valueTwo) {
            System.out.println("The numbers are equal!");
        } else if (value > valueTwo) {
            System.out.println("Greater number is: " + value);
        } else if (valueTwo > value) {
            System.out.println("Greater number is: " + valueTwo);
        }

    }
}
