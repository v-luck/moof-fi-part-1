
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zero = 1;
        System.out.println("Give a number: ");
        Integer userValue = scanner.nextInt();
        for (int i = 1; i <= userValue; i++) {
            zero = zero*i;
        }
        System.out.println(zero);


    }
}
