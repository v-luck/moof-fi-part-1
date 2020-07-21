
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userValue = scanner.nextLine();
            if (userValue.equals("")) {
                break;
            }
            String[] brokenUserValue =userValue.split(" ");
            for (String word : brokenUserValue) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }


    }
}
