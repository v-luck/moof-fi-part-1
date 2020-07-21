
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coolValue = 0;
        String storedName = "";
        int sum = 0;
        int amount = 0;
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            amount ++;
            String[] brokenUserInput = userInput.split(",");
            sum += Integer.valueOf(brokenUserInput[1]);
            if (brokenUserInput[0].length() > coolValue) {
                coolValue = brokenUserInput[0].length();
                storedName = brokenUserInput[0];
            }
        }
        System.out.println("Longest name: " + storedName);
        System.out.println("Average of the birth years: " + (1.0 * sum / amount));



    }
}
