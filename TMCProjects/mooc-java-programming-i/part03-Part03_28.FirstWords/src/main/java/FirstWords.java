
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userValue = scanner.nextLine();
            if (userValue.equals("")) {
                break;
            }
            String[] splittedUservalue = userValue.split(" ");
            System.out.println(splittedUservalue[0]);

        }


    }
}
