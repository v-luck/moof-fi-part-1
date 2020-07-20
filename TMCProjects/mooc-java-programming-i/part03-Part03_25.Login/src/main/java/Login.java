import java.util.Arrays;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userOne = {"alex", "sunshine"};
        String[] userTwo = {"emma", "haskell"};
        String[] userList = new String[2];
        int whichUser = 0;


        System.out.println("Enter username:");
        String userUser = scanner.nextLine();
        userList[0] = userUser;
        System.out.println("Enter password:");
        String userPassword = scanner.nextLine();
        userList[1] = userPassword;
        if (Arrays.equals(userOne, userList) || Arrays.equals(userTwo, userList) ) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }



    }
}
