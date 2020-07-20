
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] brokenUserInput = userInput.split(" ");
            for (String word : brokenUserInput) {
                System.out.println(word);
            }

        }


    }
}
