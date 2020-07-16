
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int userValue = scanner.nextInt();
            if (userValue == 9999) {
                break;
            }
            list.add(userValue);

        }
        int smallValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallValue) {
                smallValue = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallValue);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallValue) {
                System.out.println("Found at index:" + i);
            }
        }
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
