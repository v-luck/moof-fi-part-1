
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kidAge = 0;
        String kidName = "";
        while (true) {
            String userValue = scanner.nextLine();
            if (userValue.equals("")) {
                break;
            }
            String[] listValue = userValue.split(",");
            if (Integer.valueOf(listValue[1])>kidAge) {
               kidAge = Integer.valueOf(listValue[1]);
               kidName = listValue[0];
            }

        }
        System.out.println("Name of the oldest: " + kidName);


    }
}
