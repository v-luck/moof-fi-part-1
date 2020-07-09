
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer valueOne = scanner.nextInt();
        Integer valueTwo = scanner.nextInt();
        if (valueOne > valueTwo) {
            System.out.println(valueOne + " is greater than " + valueTwo);
        } else if (valueOne == valueTwo){
            System.out.println(valueOne + " is equal to " + valueTwo);
        } else {
            System.out.println(valueOne + " is smaller than " + valueTwo);
        }


    }
}
