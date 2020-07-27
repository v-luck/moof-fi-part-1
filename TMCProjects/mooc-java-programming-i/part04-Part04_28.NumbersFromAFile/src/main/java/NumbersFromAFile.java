
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        int count = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                String fileLine = scannerFile.nextLine();
                list.add(fileLine);
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        for (int x = lowerBound; x <= upperBound; x++) {
            if (list.contains(String.valueOf(x))) {
                count ++;
            }
        }

        System.out.println("Numbers: " + count);


    }

}
