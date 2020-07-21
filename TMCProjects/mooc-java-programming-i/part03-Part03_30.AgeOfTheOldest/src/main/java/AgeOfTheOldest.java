
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dragon = 0;
        while (true) {
            String dpg = scanner.nextLine();
            if (dpg.equals("")) {
                break;
            }
            String[] splittedDpg = dpg.split(",");
            if (Integer.valueOf(splittedDpg[1]) > dragon) {
                dragon = Integer.valueOf(splittedDpg[1]);
            }

        }
        System.out.println("Age of the oldest: " + dragon);


    }
}
