
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer amtOfNegNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            Integer value = scanner.nextInt();
            if (value < 0) {
                amtOfNegNumbers += 1;
            } else if (value == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + amtOfNegNumbers);


    }
}
