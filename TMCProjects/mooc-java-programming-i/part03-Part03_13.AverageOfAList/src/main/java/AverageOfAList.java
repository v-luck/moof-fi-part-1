
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        while (true) {
            int userValue = scanner.nextInt();
            if (userValue == -1) {
                break;
            }
            list.add(userValue);
        }
        int sum = 0;
        for (int Value : list) {
           sum += Value;
        }
        double average = 1.00 * sum / list.size();
        System.out.println("Average: " + average);



        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
