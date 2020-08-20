
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if ("add".equals(parts[0])) {
                if (Integer.valueOf(parts[1]) >= 0) {
                    if (Integer.valueOf(parts[1]) + first > 100) {
                        first = 100;
                    } else {
                        first += Integer.valueOf(parts[1]);
                    }
                }
            } else if ("move".equals(parts[0])) {
                if (Integer.valueOf(parts[1]) >= 0) {
                    if (Integer.valueOf(parts[1]) > first) {
                        second += first;
                        first = 0;
                    } else {
                        first -= Integer.valueOf(parts[1]);
                        second += Integer.valueOf(parts[1]);
                    }

                    if (second > 100) {
                        second = 100;
                    }
                }
            } else if ("remove".equals(parts[0])) {
                if (Integer.valueOf(parts[1]) >= 0) {
                    if (Integer.valueOf(parts[1]) > second) {
                        second = 0;
                    } else {
                        second -= Integer.valueOf(parts[1]);
                    }
                }
            }

        }
    }

}
