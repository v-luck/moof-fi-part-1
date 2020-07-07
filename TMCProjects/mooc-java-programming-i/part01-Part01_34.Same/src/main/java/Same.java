
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String mesage = scan.nextLine();
        System.out.println("Enter the second string:");
        String mesageTwo = scan.nextLine();
        if (mesage.equals(mesageTwo)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }


    }
}
