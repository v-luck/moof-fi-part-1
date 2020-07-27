
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        try (Scanner scanner1 = new Scanner(Paths.get(scanner.nextLine()))) {
            while (scanner1.hasNextLine())  {
                System.out.println(scanner1.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
