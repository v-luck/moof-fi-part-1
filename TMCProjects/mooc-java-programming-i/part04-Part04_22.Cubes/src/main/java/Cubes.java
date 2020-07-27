
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int store = 0;
        while (true) {
            String userValue = scanner.nextLine();
            if (userValue.equals("end")) {
                break;
            }
            int userNumber = Integer.valueOf(userValue);
            System.out.println(userNumber * userNumber * userNumber);
        }
    }
}
