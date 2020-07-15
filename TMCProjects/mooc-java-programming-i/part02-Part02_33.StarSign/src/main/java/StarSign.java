
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String dog = "";
        for (int i = 1; i <= number; i++) {
            dog += "*";
        }
        System.out.println(dog);

    }

    public static void printSquare(int size) {
        String dog = "";
        for (int i = 1; i <= size; i++) {
            dog += "*";
        }
        for (int i = 1; i <= size; i++) {
            System.out.println(dog);
        }


    }

    public static void printRectangle(int width, int height) {
        String wide= "";
        for (int i=1; i <= width; i++) {
            wide += "*";
        }
        for (int i=1; i <= height; i++) {
            System.out.println(wide);
        }
    }

    public static void printTriangle(int size) {
        String dog = "";
        for (int i = 1; i <= size; i++) {
            dog += "*";
            System.out.println(dog);
        }
    }
}
