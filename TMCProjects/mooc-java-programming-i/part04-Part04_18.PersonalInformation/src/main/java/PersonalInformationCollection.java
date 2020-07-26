
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String userFirst = scanner.nextLine();
            if (userFirst.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String userLast = scanner.nextLine();
            System.out.print("Identification number: ");
            String userInteger = scanner.nextLine();
            PersonalInformation person = new PersonalInformation(userFirst, userLast, userInteger);
            infoCollection.add(person);
        }
        System.out.println();
        for ( PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
