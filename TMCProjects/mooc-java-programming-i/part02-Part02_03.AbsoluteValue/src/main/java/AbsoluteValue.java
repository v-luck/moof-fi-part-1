
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();
        if (value < 0) {
            System.out.println(value * -1);
        } else {
            System.out.println(value);
        }

    }
}
