
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String dog = "";
        for (int i = 0; i < array.length; i++) {
            dog += String.valueOf(array[i]);
            if (!(i == array.length - 1))
                dog += ", ";
        }
        System.out.println(dog);
    }
}
