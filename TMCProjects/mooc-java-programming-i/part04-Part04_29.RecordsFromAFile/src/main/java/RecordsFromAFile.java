
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner filePath = new Scanner(Paths.get(file))) {
            while (filePath.hasNextLine()) {
                String[] wordLists = (filePath.nextLine()).split(",");
                String singularYear = " years";
                if (wordLists[1].equals("1")) {
                    singularYear = " year";
                }
                System.out.println(wordLists[0] + ", age: " + wordLists[1] + singularYear);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }



    }
}
