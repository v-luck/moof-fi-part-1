
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String message = scan.nextLine();
        System.out.println("Give an integer:");
        Integer messagev2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double messagev4 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean messagev3 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + messagev2);
        System.out.println("You gave the double " + messagev4);
        System.out.println("You gave the boolean " + messagev3);






    }
}
