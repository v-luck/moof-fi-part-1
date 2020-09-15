import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {
    private ArrayList<Bird> birdsDataBase;
    private Scanner scanner;

    public BirdDatabase(Scanner scanner) {
        this.birdsDataBase = new ArrayList<>();
        this.scanner = scanner;
    }

    public void checkCommand(String command) {
        switch (command) {
            case "Add":
                addBird();
                break;
            case "Observation":
                addObservation();
                break;
            case "All":
                for (Bird bird : birdsDataBase) {
                    System.out.println(bird);
                }
                break;
            case "One":
                returnBird();
                break;
        }
    }

    public void returnBird() {
        System.out.println("Bird? ");
        String birdName = scanner.nextLine();
        if (containsBirdName(birdName) != null) {
            System.out.println(containsBirdName(birdName));
        } else {
            System.out.println("Bird not found!");
        }
    }

    public void addBird() {
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String birdLatinName = scanner.nextLine();
        Bird bird = new Bird(birdName, birdLatinName);
        if (containsBirdName(birdName) == null) {
            birdsDataBase.add(bird);
        } else {
            System.out.println("Bird already added");
        }

    }

    public void addObservation() {
        System.out.print("Bird: ");
        String birdName = scanner.nextLine();
        if (containsBirdName(birdName) != null) {
            containsBirdName(birdName).increaseObservationCount();
        } else {
            System.out.println("Not a bird!");
        }
    }

    public Bird containsBirdName(String birdName) {
        for (Bird bird: birdsDataBase) {
            if (bird.returnBirdName().equals(birdName)) {
                return bird;
            }
        }
        return null;
    }
}
