
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userValue = scanner.nextLine();
            if (userValue.equals("")) {
                break;
            }
            String[] userList = userValue.split(" ");
            System.out.println(userList[userList.length-1]);

        }


    }
}
